package com.asiansandharry.campuslinkbackend.User;


import jakarta.persistence.*;

@Table
@Entity
public class Timetable {
    @Id
    private long timetableId;
    private long AccountId;
    private long lessonId;

    public Timetable() {
    }

    public Timetable(long timetableId, long accountId, long lessonId, String day, String time, int length) {
        this.timetableId = timetableId;
        AccountId = accountId;
        this.lessonId = lessonId;
        this.day = day;
        this.time = time;
        this.length = length;
    }

    public long getTimetableId() {
        return timetableId;
    }

    public void setTimetableId(long timetableId) {
        this.timetableId = timetableId;
    }

    public long getAccountId() {
        return AccountId;
    }

    public void setAccountId(long accountId) {
        AccountId = accountId;
    }

    public long getLessonId() {
        return lessonId;
    }

    public void setLessonId(long lessonId) {
        this.lessonId = lessonId;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Timetable{" +
                "timetableId=" + timetableId +
                ", AccountId=" + AccountId +
                ", lessonId=" + lessonId +
                ", day='" + day + '\'' +
                ", time='" + time + '\'' +
                ", length=" + length +
                '}';
    }
}