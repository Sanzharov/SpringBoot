package com.Json.logJson.service;

import com.Json.logJson.entity.Results;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Service
public class LogService {

    public String getLogFilter(String filter) throws IOException
    {
        List<String> listLine = Files.readAllLines
                (Paths.get("..\\SpringBoot\\logJson\\src\\main\\resources\\logs\\log.txt"));

        Results results = new Results();

        int counter = 0;
        for(int i = 0; i < listLine.size(); i++)
        {
            if(listLine.get(i).contains(filter))
            {
                counter++;
                results.add(counter, listLine.get(i));

            }
        }
        results.setCount(counter++);

        Gson GSON = new GsonBuilder().setPrettyPrinting().create();
        String json = GSON.toJson(results);

        return json;
    }
}
