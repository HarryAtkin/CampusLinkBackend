package com.asiansandharry.campuslinkbackend.User;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Account {
    @Id
    private Long AccountID;
    /* Foreign Key from University table */
    private Long UniversityID;
    private String Email;
    private String Password;
    private String Role;
    private String lName;
    private String fName;
    private Date DOB;

    public Account() {}
  
    public Account(Long accountID, Long universityID, String email, String password, String role, String lName, String fName, Date DOB) {
        AccountID = accountID;
        UniversityID = universityID;
        Email = email;
        Password = password;
        Role = role;
        this.lName = lName;
        this.fName = fName;
        this.DOB = DOB;
    }

    /* ----- Getters ----- */
    public Long getAccountID() {return AccountID;}

    public long getUniversityID() {return UniversityID;}

    public String getEmail() {return Email;}

    public String getPassword() {return Password;}

    public String getRole() {return Role;}

    public String getlName() {return lName;}

    public String getfName() {return fName;}

    public Date getDOB() {return DOB;}

    /* ----- Setters ----- */
    public void setAccountID(Long accountID) {
        AccountID = accountID;
    }

    public void setUniversityID(Long universityID) {
        UniversityID = universityID;
    }
    public void setEmail(String email) {
        Email = email;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setRole(String role) {
        Role = role;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return "Account{" +
                "AccountID=" + AccountID +
                ", UniversityID='" + UniversityID + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                ", Role='" + Role + '\'' +
                ", lName='" + this.lName + '\'' +
                ", fName='" + this.fName + '\'' +
                ", DOB='" + this.DOB + '\'' +
                '}';
    }
}
