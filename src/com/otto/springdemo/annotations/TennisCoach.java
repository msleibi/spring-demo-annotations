package com.otto.springdemo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("thatSillyCoach")
@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

        // Field Injection
    @Autowired
    @Qualifier("randomFortuneService")
    //@Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    //define default Constructor
    public TennisCoach(){
        System.out.println(">> TennisCoach: inside default constructor");
    }

    // define my init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
    }

    // define my destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
    }


            /*
    // Method Injection
    @Autowired
    @Qualifier("happyFortuneService")
    public void doSomeCrzyStuff(FortuneService fortuneService){
        System.out.println(">> TennisCoach: inside doSomeCrzyStuff() method");
        this.fortuneService=fortuneService;
    }
        */

        // Setter Injection
//    @Autowired
//    @Qualifier("happyFortuneService")
//    public void setFortuneService(FortuneService fortuneService){
//        System.out.println(">> TennisCoach: inside setFortuneService() method");
//        this.fortuneService=fortuneService;
//    }


    /*
    //  Constructor Injection
    @Autowired
    public TennisCoach(FortuneService theFortuneService){
        fortuneService=theFortuneService;
    }*/

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
