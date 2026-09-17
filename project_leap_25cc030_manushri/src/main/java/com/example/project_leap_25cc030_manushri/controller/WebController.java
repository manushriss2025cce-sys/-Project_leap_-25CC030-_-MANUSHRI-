package com.example.project_leap_25cc030_manushri.controller;

import com.example.project_leap_25cc030_manushri.services.WebService;
import com.example.project_leap_25cc030_manushri.services.impl.WebServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @PostMapping("/data/write")
    String writeData(String Data){
        WebService webService=new WebServiceImpl();
        return webService.writeData(Data);
    }
}
