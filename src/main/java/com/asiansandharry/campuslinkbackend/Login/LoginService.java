package com.asiansandharry.campuslinkbackend.Login;

import com.asiansandharry.campuslinkbackend.User.Account;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

//This handles the business logic (so functionality)
@Service
public class LoginService {

    private final LoginRepository loginRepository; //This allows us the access the database.

    @Autowired
    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public void Authenticate(String data) {

        JsonObject DataJson = JsonParser.parseString(data).getAsJsonObject();
        String email = DataJson.get("Email").getAsString();
        String password = DataJson.get("Password").getAsString();

        System.out.println("Email: " + email);

        Account account = loginRepository.findByEmail(email).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Incorrect Email or Password"));
        System.out.println(account);



        if(password.equals(account.getPassword())) {
            throw new ResponseStatusException(HttpStatus.ACCEPTED, "Correct Password");
        }
        else{
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Incorrect Email or Password");
        }
    }
}
