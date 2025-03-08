package com.asiansandharry.campuslinkbackend.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController//Makes this class a controller class at the mapping below so this is what runs when the user goes to the below url
@RequestMapping(path = "api/v1/login")
@CrossOrigin(origins = "http://localhost:5500/")
public class LoginController {
    private final LoginService loginService; //Allows us to perform any of the business logic

    //This automatically is called and defines the login service.
    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    //POST method that takes in the http body and checks it against the database.
    @PostMapping()
    public void Authenticate(@RequestBody String Data){
        loginService.Authenticate(Data);
    }



}
