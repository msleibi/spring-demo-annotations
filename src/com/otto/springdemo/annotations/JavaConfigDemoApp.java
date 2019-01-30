package com.otto.springdemo.annotations;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaConfigDemoApp {

    public static void main(String[] args) {

        // read spring config file
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from spring container
        //Coach theCoach=context.getBean("thatSillyCoach",Coach.class);

        Coach theCoach=context.getBean("tennisCoach",Coach.class);
        //Coach theCoach2=context.getBean("boxingCoach",Coach.class);

        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
      //  System.out.println(theCoach2.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();

    }

}
