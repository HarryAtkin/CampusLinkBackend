package com.asiansandharry.campuslinkbackend.User;

import jakarta.persistence.*;

@Entity
@Table
public class Account {
    @Id
    int AccountID;
    String Email;
    String Password;

    public Account() {

    }

    enum role {Student, Teacher, Admin}

    public Account(int accountID, String email, String password) {
        AccountID = accountID;
        Email = email;
        Password = password;
    }

    public int getAccountID() {
        return AccountID;
    }

    public void setAccountID(int accountID) {
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
