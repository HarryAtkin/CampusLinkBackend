package com.asiansandharry.campuslinkbackend.StudentTools.StudentDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentDetailsService {

    private final StudentDetailsRepository studentDetailsRepository;

    @Autowired
    public StudentDetailsService(StudentDetailsRepository studentDetailsRepository) {
        this.studentDetailsRepository = studentDetailsRepository;
    }

    public List<String> Attendance(){
        List<String> attendance = new ArrayList<>();
        //attendance.add(studentDetailsRepository.getAttendanceByLesson(0, 1));
        return attendance;
    }

}
