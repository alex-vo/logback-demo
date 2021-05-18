package com.example.logdemo;

import net.logstash.logback.fieldnames.LogstashFieldNames;

public class CustomLogstashFieldNames extends LogstashFieldNames {

    private String abc = "abc";

    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }
}
