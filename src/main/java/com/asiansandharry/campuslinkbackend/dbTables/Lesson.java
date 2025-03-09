package com.asiansandharry.campuslinkbackend.dbTables;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Lesson {
    @Id
    private long LessonId;
    /* Foreign Key from Module table */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(columnDefinition = "ModuleID")
    private Module Module;
    /* Foreign Key from Room table */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(columnDefinition = "RoomNo")
    private Room Room;
    private Date StartDate;
    private Date EndDate;

    public Lesson() {
    }

    public Lesson(long LessonId, Module Module, Room Room, Date StartDate, Date EndDate) {
        this.LessonId = LessonId;
        this.Module = Module;
        this.Room = Room;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
    }

    public long getLessonId() {
        return LessonId;
    }

    public void setLessonId(long lessonId) {
        LessonId = lessonId;
    }

    public Module getModule() {
        return Module;
    }

    public void setModule(Module module) {
        Module = module;
    }

    public Room getRoom() {
        return Room;
    }

    public void setRoom(Room room) {
        Room = room;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "LessonId=" + LessonId +
                ", Module='" + Module + '\'' +
                ", Room='" + Room + '\'' +
                ", StartDate='" + StartDate + '\'' +
                ", EndDate='" + EndDate + '\'' +
                '}';
    }
}

