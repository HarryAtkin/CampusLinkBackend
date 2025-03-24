package com.asiansandharry.campuslinkbackend.StudentTools.TimeTable;

import com.asiansandharry.campuslinkbackend.dbTables.Lesson;
import com.asiansandharry.campuslinkbackend.dbTables.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TimetableRepository extends JpaRepository<Lesson, Long> {

//SELECT al.Lesson.Module.ModuleName, al.Lesson.StartDate, al.Lesson.EndDate FROM AccountLesson al WHERE al.Account.Email = :UID
    @Query("SELECT l.Module.ModuleName, l.StartDate, l.EndDate From Lesson l where l.Module = :m")
    List<List<String>> findLessonTimeTable(Module m);


    @Query("SELECT Ma.Module FROM ModuleAccount Ma WHERE Ma.Account.Email = :UID")
    List<Module> findModulesByUID(String UID);

//    @Query("SELECT al.Lesson.Module.ModuleName, al.Lesson.StartDate, al.Lesson.EndDate FROM AccountLesson al WHERE al.Account.Email = :UID")
//    List<List<String >> findModulesByUID(String UID);
}
