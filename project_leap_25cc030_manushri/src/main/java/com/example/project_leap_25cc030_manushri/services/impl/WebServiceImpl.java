package com.example.project_leap_25cc030_manushri.services.impl;

import com.example.project_leap_25cc030_manushri.repository.WebRepository;
import com.example.project_leap_25cc030_manushri.repository.impl.WebRepositoryImpl;
import com.example.project_leap_25cc030_manushri.services.WebService;
import org.springframework.stereotype.Service;


@Service
public class WebServiceImpl implements WebService {
    @Override
    public String writeData(String data) {
        WebRepository webRepository = new WebRepositoryImpl();
        return webRepository.writeData(data);
    }
}

