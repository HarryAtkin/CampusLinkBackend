package com.asiansandharry.campuslinkbackend.User;
import jakarta.persistence.*;

@Entity
@Table
public class Teacher {

    @Id
    int TeacherID;
    String lName;
    String Email;
    String fName;
    String DOB;

    public Teacher(int teacherID, String lName, String email, String fName, String DOB) {
        TeacherID = teacherID;
        this.lName = lName;
        Email = email;
        this.fName = fName;
        this.DOB = DOB;
    }

    public Teacher() {

    }

    public int getTeacherID() {
        return TeacherID;
    }

    public void setTeacherID(int teacherID) {
        TeacherID = teacherID;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "TeacherID=" + TeacherID +
                ", lName='" + lName + '\'' +
                ", Email='" + Email + '\'' +
                ", fName='" + fName + '\'' +
                ", DOB='" + DOB + '\'' +
                '}';
    }
}
