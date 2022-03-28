package com.springprojects.inversioncontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CookApp {
    public static void main(String[] args) {
        SpringApplication.run(InversionControlApplication.class, args);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cook.xml");
        HeadChef cooker = context.getBean("headchef",HeadChef.class);
        System.out.println(cooker.makeFood());
    }
}
