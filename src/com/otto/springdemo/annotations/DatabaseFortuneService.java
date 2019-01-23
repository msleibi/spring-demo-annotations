package com.otto.springdemo.annotations;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return null;
    }
}
