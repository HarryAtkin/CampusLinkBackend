package com.asiansandharry.campuslinkbackend.StudentTools.TimeTable;

import com.asiansandharry.campuslinkbackend.dbTables.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentTimeTableService {
    private TimetableRepository timetableRepository;
    private String UID;

    @Autowired
    public StudentTimeTableService(TimetableRepository timetableRepository) {
        this.timetableRepository = timetableRepository;
    }

    public void Authenticate(String data) {
        this.UID = data;
    }

    public List<List<List<String>>> GetTimeTable(){
         List<Module> Modules = this.timetableRepository.findModulesByUID(this.UID);
         List<List<List<String>>> TimeTable = new ArrayList<List<List<String>>>();
         for (Module module : Modules) {
             TimeTable.add(timetableRepository.findLessonTimeTable(module));

         }
        System.out.println(UID);
        System.out.println(TimeTable);
        return TimeTable;
    }


}
