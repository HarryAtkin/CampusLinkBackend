package com.asiansandharry.campuslinkbackend.dbTables;

import jakarta.persistence.*;

@Entity
@Table
public class AccountLesson {
    /* Junction table between Lesson and Account */

    /* Composite Primary Key AccountID & LessonID*/
    @Id
    /* Foreign Key from Account table */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(columnDefinition = "accountid")
    private Account Account;
    /* Foreign Key from Lesson table */

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(columnDefinition = "Lessonid")
    private Lesson Lesson;
    private Boolean attended;
    private String reason;

    public AccountLesson() {}

    public AccountLesson(Account Account, Lesson Lesson, Boolean attended, String reason) {
        this.Account = Account;
        this.Lesson = Lesson;
        this.attended = attended;
        this.reason = reason;
    }

    public Account getAccount() {
        return Account;
    }

    public void setAccount(Account account) {
        Account = account;
    }

    public Lesson getLesson() {
        return Lesson;
    }

    public void setLesson(Lesson lesson) {
        Lesson = lesson;
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
                "Account=" + Account +
                ", Lesson='" + Lesson + '\'' +
                ", attended='" + attended + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
