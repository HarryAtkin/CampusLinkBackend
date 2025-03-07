package com.asiansandharry.campuslinkbackend.Login;

import com.asiansandharry.campuslinkbackend.User.Account;
import com.asiansandharry.campuslinkbackend.User.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class LoginConfig {

    @Bean
    CommandLineRunner commandLineRunner(LoginRepository loginRepository) {
        return args -> {
//            Account account0 = new Account(1L, "Test@dev.com", "Test");
//            Account account1 = new Account(2L, "David@dev.com", "dev123");
//            Account account2 = new Account(3L, "Jerry@dev.com", "Jerry9");
//            Account account3 = new Account(4L, "Angela@dev.com", "Angela072");
//
//            loginRepository.saveAll(List.of(account0, account1, account2, account3));

        };
    }
}
