package com.asiansandharry.campuslinkbackend.StudentTools.StudentDetails;

import com.asiansandharry.campuslinkbackend.dbTables.Account;
import com.asiansandharry.campuslinkbackend.dbTables.AccountLesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentDetailsRepository extends JpaRepository<Account, Long> {

    @Query("SELECT AL.Account.AccountID, AL.Lesson.Module.ModuleName, AL.attended FROM AccountLesson AL WHERE AL.Account.Email = :UID")
    List<List<String>> GetAttendance(String UID);

    @Query("SELECT A.fName, A.lName FROM Account A WHERE A.Email = :uid")
    List<List<String>> getName(String uid);
}
