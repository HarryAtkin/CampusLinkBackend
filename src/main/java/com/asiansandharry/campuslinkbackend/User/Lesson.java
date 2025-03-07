package com.asiansandharry.campuslinkbackend.User;

import jakarta.persistence.*;

@Table
@Entity
public class Lesson {
    @Id
    private Long lessonId;
    private Long moduleId;
    private String day;
    private String startTime;
    private String endTime;

    public Lesson() {}

    public Lesson(Long lessonId, Long moduleId, String day, String startTime, String endTime) {
        this.lessonId = lessonId;
        this.moduleId = moduleId;
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Long getLessonId() {
        return lessonId;
    }

    public void setLessonId(Long lessonId) {
        this.lessonId = lessonId;
    }

    public Long getModuleId() {
        return moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonId=" + lessonId +
                ", moduleId=" + moduleId +
                ", day='" + day + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}
