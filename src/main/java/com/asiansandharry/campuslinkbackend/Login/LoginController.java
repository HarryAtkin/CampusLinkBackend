package com.asiansandharry.campuslinkbackend.Login;

import com.asiansandharry.campuslinkbackend.User.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController//Makes this class a controller class at the mapping below so this is what runs when the user goes to the below url
@RequestMapping(path = "api/v1/login")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class LoginController {
    private final LoginService loginService; //Allows us to perform any of the business logic

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    //@CrossOrigin(origins = "http://127.0.0.1:5500") //Research
    /*@GetMapping
    public List<Account> getAccounts() {
        return loginService.getAccounts();
    }

     */



    @GetMapping
    public List<String> isLogged() {
        return loginService.getIsLoggedIn();
    }


    @PostMapping
    public void notsure(@RequestBody String Data){
        loginService.Authenticate(Data);
    }



}
