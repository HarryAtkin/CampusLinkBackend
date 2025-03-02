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
    private boolean isLoggedIn = false;

    @Autowired
    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public List<Account> getAccounts() {
        //return loginRepository.findAll();
        Account Account1 = new Account();
        Account1.setAccountID(0L);
        Account1.setPassword("password");
        Account1.setEmail("H@gmail.com");
        return List.of(Account1);
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
            //Something to determine login is successful
            throw new ResponseStatusException(HttpStatus.ACCEPTED, "Correct Password");
        }
        else{
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Incorrect Email or Password");
        }




        /*if(password.equals("password1232")) {
            isLoggedIn = true;
        }
        else{
            isLoggedIn = false;
        }

         */


        //System.out.println("Email: " + email);
        //System.out.println("Password: " + password);

        //System.out.println(data);
    }

    public List<String> getIsLoggedIn() {
        String temp = "{isLogged='" + isLoggedIn + "'}";
        JsonObject DataJson = JsonParser.parseString(temp).getAsJsonObject();
        return List.of(DataJson.get("isLogged").getAsString());
    }
}
