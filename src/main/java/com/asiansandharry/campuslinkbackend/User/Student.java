package com.asiansandharry.campuslinkbackend.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table
public class Student {

    @Id
    //@Column(name="StudentID", nullable=false, unique=true)
    private int StudentID;;
    private String lName;
    private String fName;
    private Date DOB;
    private String Email;

    public Student() {

    }

    public Student(int studentID, String lName, String fName, Date DOB, String email) {
        StudentID = studentID;
        Email = email;
        this.lName = lName;
        this.fName = fName;
        this.DOB = DOB;
    }



    public Date getDOB() {
        return DOB;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getEmail() {
        return Email;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public void setEmail(String email) {
        Email = email;
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
        return "Student{" +
                "StudentID=" + StudentID +
                ", Email=" + Email +
                ", lName='" + lName + '\'' +
                ", fName='" + fName + '\'' +
                ", DOB=" + DOB +
                '}';
    }
}
