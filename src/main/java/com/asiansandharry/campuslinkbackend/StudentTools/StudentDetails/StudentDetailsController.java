package com.asiansandharry.campuslinkbackend.StudentTools.StudentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/studentTools/studentDetails")
@CrossOrigin()//Not decided yet.
public class StudentDetailsController {

    private final StudentDetailsService studentDetailsService;

    @Autowired
    public StudentDetailsController(StudentDetailsService studentDetailsService) {
        this.studentDetailsService = studentDetailsService;
    }

    @PostMapping()
    public void setUID(@RequestBody String body){
        studentDetailsService.setUID(body);
    }

    @GetMapping(path = "/Name")
    public List<List<String>> getName(){
        return studentDetailsService.getName();
    }

    @GetMapping("/Attendance")
    public List<List<String>> Attendance(){
        return studentDetailsService.Attendance();
    }



}

