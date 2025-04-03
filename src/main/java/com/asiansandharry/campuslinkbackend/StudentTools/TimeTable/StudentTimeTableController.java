package com.asiansandharry.campuslinkbackend.StudentTools.TimeTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/studentTools/timeTable")
@CrossOrigin(origins = "http://localhost:5500/")
public class StudentTimeTableController {

    private final StudentTimeTableService studentTimeTableService;

    @Autowired
    public StudentTimeTableController(StudentTimeTableService studentTimeTableService) {
        this.studentTimeTableService = studentTimeTableService;
    }

    @PostMapping
    public void Authenticate(@RequestBody String data){
        studentTimeTableService.Authenticate(data);
    }

    @GetMapping
    public List<List<List<String>>> GetTable(){
        return studentTimeTableService.GetTimeTable();
    }
}
