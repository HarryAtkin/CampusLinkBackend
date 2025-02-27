package com.asiansandharry.campuslinkbackend.Login;

import com.asiansandharry.campuslinkbackend.User.Account;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//This handles the business logic (so functionality)
@Service
public class LoginService {

    private final LoginRepository loginRepository; //This allows us the access the database.

    @Autowired
    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public List<Account> getAccounts() {
        //return loginRepository.findAll();
        Account Account1 = new Account();
        Account1.setAccountID(0);
        Account1.setPassword("password");
        Account1.setEmail("H@gmail.com");
        return List.of(Account1);
    }

    public List<String> Authenticate(String data) {

        JsonObject DataJson = JsonParser.parseString(data).getAsJsonObject();

        String email = DataJson.get("Email").getAsString();
        String password = DataJson.get("Password").getAsString();

        Account account = loginRepository.findByEmail(email).orElseThrow(
                () -> new IllegalStateException("Email does not exist"));

        if(password.equals(account.getPassword())) {
            //Something to determine login is successful
        }


        System.out.println("Email: " + email);
        System.out.println("Password: " + password);

        System.out.println(data);
        return List.of(data);
    }

}
