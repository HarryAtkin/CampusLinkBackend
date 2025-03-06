package com.asiansandharry.campuslinkbackend.User;

import jakarta.persistence.*;

@Entity
@Table
public class Account {
    @Id
    private Long AccountID;
    private String Email;
    private String Password;

    public Account() {

    }

    public Account(Long accountID, String email, String password) {
        AccountID = accountID;
        Email = email;
        Password = password;
    }

    public Long getAccountID() {
        return AccountID;
    }

    public void setAccountID(Long accountID) {
        AccountID = accountID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "AccountID=" + AccountID +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
