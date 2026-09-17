package com.example.project_leap_25cc030_manushri.repository.impl;

import com.example.project_leap_25cc030_manushri.repository.WebRepository;
import org.springframework.stereotype.Repository;

import java.io.FileWriter;
import java.io.IOException;

@Repository

public class WebRepositoryImpl implements WebRepository {


    @Override
    public String writeData(String data) {
            try {
                FileWriter writer = new FileWriter("data.txt");

                writer.write(data);

                writer.close();
                return "Data written successfully";
            }
            catch (IOException e) {
                return "An error occured : " + e.getLocalizedMessage();
            }

    }
}
