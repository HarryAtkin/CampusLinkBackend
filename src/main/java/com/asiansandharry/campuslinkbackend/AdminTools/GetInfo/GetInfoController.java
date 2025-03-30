package com.asiansandharry.campuslinkbackend.AdminTools.GetInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/adminTools/getInfo")
@CrossOrigin(origins = "http://localhost:5500/")
public class GetInfoController {

    private final GetInfoService getInfoService;

    @Autowired
    public GetInfoController(GetInfoService getInfoService) {
        this.getInfoService = getInfoService;
    }

    @PostMapping
    public void UniId(@RequestBody String data){
        getInfoService.SetUniID(data);
    }

    @CrossOrigin(origins = "http://localhost:5500/")
    @RequestMapping(path = "/admin")
    @GetMapping
    public List<Long> getInfo() {
        return getInfoService.getInfo();
    }
}