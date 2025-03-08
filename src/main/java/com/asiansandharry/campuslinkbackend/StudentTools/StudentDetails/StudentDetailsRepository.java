package com.asiansandharry.campuslinkbackend.StudentTools.StudentDetails;

import com.asiansandharry.campuslinkbackend.dbTables.AccountLesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentDetailsRepository extends JpaRepository<AccountLesson, Long> {


}
