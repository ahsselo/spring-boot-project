package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

//remember the component annotation marks the class as a spring bean
@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout(){
        return "Practice fast bowling for 15 minutes";
    }
}
