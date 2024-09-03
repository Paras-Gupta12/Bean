package com.interviewprep.paras.week1.introductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//@Component
public class Apple {

    void eatApple(){
        System.out.println("I am eating the apple");
    }

    @PostConstruct
    void callThisBeforeApplicationIsUsed(){
        System.out.println("Creating the apple before use");
    }

    @PreDestroy
    void callThisBeforeDestroy(){
        System.out.println("Destroying the apple bean");
    }
}
