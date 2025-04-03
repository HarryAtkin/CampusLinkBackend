package com.asiansandharry.campuslinkbackend.AdminTools.GetInfo;

import com.asiansandharry.campuslinkbackend.dbTables.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GetInfoInterface extends JpaRepository<University, Long> {
    @Query("SELECT COUNT(a) FROM Account a WHERE a.university.UniversityID = :id AND a.Role = 'Admin'")
    Long GetAdminAmnt(Long id);

    @Query("SELECT COUNT(a) FROM Account a WHERE a.university.UniversityID = :id AND a.Role = 'Teacher'")
    Long GetTeacherAmnt(Long id);

    @Query("SELECT COUNT(a) FROM Account a WHERE a.university.UniversityID = :id AND a.Role = 'Student'")
    Long GetStudentAmnt(Long id);

    @Query("SELECT COUNT(MA.Module) FROM ModuleAccount MA WHERE MA.Account.university.UniversityID = :id")
    Long GetCourseAmnt(Long id);

    @Query("SELECT a.university.UniversityID from Account a WHERE a.Email =:data")
    Long GetUniId(String data);
}
