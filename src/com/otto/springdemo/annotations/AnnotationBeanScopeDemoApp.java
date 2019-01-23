package com.otto.springdemo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {

        //load spring config file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve the bean from the container
        Coach theCoach=context.getBean("tennisCoach",Coach.class);

        Coach alphaCoach=context.getBean("tennisCoach",Coach.class);

        //check if they are the same

        boolean result=(theCoach==alphaCoach);

        //print the results
        System.out.println("\n Pointing to the same object "+result);

        System.out.println("\n Memory location for theCoach "+theCoach);

        System.out.println("\n Memory location for alphaCoach "+alphaCoach);

        //close the context
        context.close();

    }
}
