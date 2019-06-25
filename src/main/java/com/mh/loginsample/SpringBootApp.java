package com.mh.loginsample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication

public class SpringBootApp  {
    @Autowired
    private ApplicationContext appContext;


    public static void main(String args[]) {
        SpringApplication.run(SpringBootApp.class, args);
    }


}