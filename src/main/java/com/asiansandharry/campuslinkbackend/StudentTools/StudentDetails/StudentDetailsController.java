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

    @PostMapping(path = "api/v1/authenticated")
    public void isAuthenticated(@RequestBody String body){

    }

    @GetMapping()
    public List<String> Attendance(){
        return studentDetailsService.Attendance();
    }



}

