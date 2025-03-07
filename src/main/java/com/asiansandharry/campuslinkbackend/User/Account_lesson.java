package com.asiansandharry.campuslinkbackend.User;

import jakarta.persistence.*;

@Entity
@Table
public class Account_lesson {

    @Id
    private Long AccountID;
    private Long lessonID;
    private char attendance;
    private String reason;

    public Account_lesson() {}

    public Account_lesson(Long accountID, Long lessonID, char attendance, String reason) {
        AccountID = accountID;
        this.lessonID = lessonID;
        this.attendance = attendance;
        this.reason = reason;
    }

    public Long getAccountID() {
        return AccountID;
    }

    public void setAccountID(Long accountID) {
        AccountID = accountID;
    }

    public Long getLessonID() {
        return lessonID;
    }

    public void setLessonID(Long lessonID) {
        this.lessonID = lessonID;
    }

    public char getAttendance() {
        return attendance;
    }

    public void setAttendance(char attendance) {
        this.attendance = attendance;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Account_lesson{" +
                "AccountID=" + AccountID +
                ", lessonID=" + lessonID +
                ", attendance=" + attendance +
                ", reason='" + reason + '\'' +
                '}';
    }
}
