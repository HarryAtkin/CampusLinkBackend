package com.asiansandharry.campuslinkbackend.dbTables;

import jakarta.persistence.*;

@Entity
@Table
public class AccountLesson {
    /* Junction table between Lesson and Account */

    /* Composite Primary Key AccountID & LessonID*/
    @Id
    /* Foreign Key from Account table */
    private long AccountID;
    /* Foreign Key from Lesson table */
    private long LessonID;
    private Boolean attended;
    private String reason;

    public AccountLesson() {}

    public AccountLesson(long AccountID, long LessonID, Boolean attended, String reason) {
        this.AccountID = AccountID;
        this.LessonID = LessonID;
        this.attended = attended;
        this.reason = reason;
    }

    public long getAccountID() {
        return AccountID;
    }

    public void setAccountID(long accountID) {
        AccountID = accountID;
    }

    public long getLessonID() {
        return LessonID;
    }

    public void setLessonID(long lessonID) {
        LessonID = lessonID;
    }

    public Boolean getAttended() {
        return attended;
    }

    public void setAttended(Boolean attended) {
        this.attended = attended;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "AccountLesson{" +
                "AccountID=" + AccountID +
                ", LessonID='" + LessonID + '\'' +
                ", attended='" + attended + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
