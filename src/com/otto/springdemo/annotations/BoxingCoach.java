package com.otto.springdemo.annotations;

import org.springframework.stereotype.Component;

@Component
public class BoxingCoach implements Coach {

    @Override
    public String getDailyWorkout() {

        return "Give him a Knouckout!";
    }

    @Override
    public String getDailyFortune() {

        return null;
    }
}
