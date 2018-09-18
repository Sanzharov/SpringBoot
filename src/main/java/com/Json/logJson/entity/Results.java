package com.Json.logJson.entity;

import java.util.ArrayList;
import java.util.List;

public class Results {

    private List<Log> results = new ArrayList<Log>();
    private int count;

    public Results() {
    }

    public List<Log> getResults() {return results;}

    public void setResults(List<Log> results) {this.results = results;}

    public int getCount() {return count;}

    public void setCount(int count) {this.count = count;}

    public void add(int linenumber, String values)
    {
        Log log = new Log();
        log.setLinenumber(linenumber);
        log.setValues(values);
        this.results.add(log);
    }

}
