package com.Json.logJson.controller;

import com.Json.logJson.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/search")
public class LogController {

    @Autowired
    private LogService logService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String logSearch(@RequestParam String q) throws IOException{

        return logService.getLogFilter(q);

    }
}