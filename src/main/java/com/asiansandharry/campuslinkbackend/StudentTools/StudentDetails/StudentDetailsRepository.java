package com.asiansandharry.campuslinkbackend.StudentTools.StudentDetails;

import com.asiansandharry.campuslinkbackend.User.Account_lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentDetailsRepository extends JpaRepository<Account_lesson, Long> {

    @Query("SELECT attendance, reason FROM Account_lesson WHERE AccountID = :account AND lessonID = :lesson")
    String getAttendanceByLesson(int account, int lesson);

}
