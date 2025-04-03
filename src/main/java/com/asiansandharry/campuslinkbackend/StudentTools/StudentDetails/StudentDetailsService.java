package com.asiansandharry.campuslinkbackend.StudentTools.StudentDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentDetailsService {

    private final StudentDetailsRepository studentDetailsRepository;
    private String UID;

    @Autowired
    public StudentDetailsService(StudentDetailsRepository studentDetailsRepository) {
        this.studentDetailsRepository = studentDetailsRepository;
    }

    public void setUID(String data){
        this.UID = data;
    }

    public List<List<String>> Attendance(){
        return studentDetailsRepository.GetAttendance(this.UID);

    }

    public List<List<String>> getName() {
        return studentDetailsRepository.getName(this.UID);
    }
}
