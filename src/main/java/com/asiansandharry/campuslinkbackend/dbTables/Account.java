package com.asiansandharry.campuslinkbackend.dbTables;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Account {
    @Id
    private Long AccountID;
    /* Foreign Key from University table */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(columnDefinition = "UniversityID")
    private University university;
    private String Email;
    private String Password;
    private String Role;
    private String lName;
    private String fName;
    private Date DOB;

    public Account() {}
  
    public Account(Long accountID, University university, String email, String password, String role, String lName, String fName, Date DOB) {
        AccountID = accountID;
        university = university;
        Email = email;
        Password = password;
        Role = role;
        this.lName = lName;
        this.fName = fName;
        this.DOB = DOB;
    }

    /* ----- Getters ----- */
    public Long getAccountID() {return AccountID;}

    public University getUniversity() {return university;}

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

    public void setUniversity(University university) {
        university = university;
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
                ", UniversityID='" + university + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                ", Role='" + Role + '\'' +
                ", lName='" + this.lName + '\'' +
                ", fName='" + this.fName + '\'' +
                ", DOB='" + this.DOB + '\'' +
                '}';
    }
}
