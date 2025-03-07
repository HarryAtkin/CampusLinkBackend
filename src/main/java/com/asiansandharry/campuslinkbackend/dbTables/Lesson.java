package com.asiansandharry.campuslinkbackend.dbTables;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Lesson {
    @Id
    private long LessonId;
    /* Foreign Key from Module table */
    private long ModuleID;
    /* Foreign Key from Room table */
    private String RoomNo;
    private Date StartDate;
    private Date EndDate;

    public Lesson() {
    }

    public Lesson(long LessonId, long ModuleID, String RoomNo, Date StartDate, Date EndDate) {
        this.LessonId = LessonId;
        this.ModuleID = ModuleID;
        this.RoomNo = RoomNo;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
    }

    public long getLessonId() {
        return LessonId;
    }

    public void setLessonId(long lessonId) {
        LessonId = lessonId;
    }

    public long getModuleID() {
        return ModuleID;
    }

    public void setModuleID(long moduleID) {
        ModuleID = moduleID;
    }

    public String getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(String roomNo) {
        RoomNo = roomNo;
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
                ", ModuleID='" + ModuleID + '\'' +
                ", RoomNo='" + RoomNo + '\'' +
                ", StartDate='" + StartDate + '\'' +
                ", EndDate='" + EndDate + '\'' +
                '}';
    }
}

