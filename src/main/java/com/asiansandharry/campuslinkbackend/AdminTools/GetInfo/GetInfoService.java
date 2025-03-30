package com.asiansandharry.campuslinkbackend.AdminTools.GetInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.LogManager;

@Service
public class GetInfoService {

    private final GetInfoInterface getInfo;
    private Long uniID;

    @Autowired
    public GetInfoService(GetInfoInterface getInfo) {
        this.getInfo = getInfo;
    }


    public List<Long> getInfo(){

        return List.of(getInfo.GetAdminAmnt(this.uniID), getInfo.GetTeacherAmnt(this.uniID), getInfo.GetStudentAmnt(this.uniID), getInfo.GetCourseAmnt(this.uniID));
    }

    public void SetUniID(String data) {
        this.uniID = getInfo.GetUniId(data);
    }
}
