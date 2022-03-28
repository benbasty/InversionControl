package com.springprojects.inversioncontrol;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FoodConfigApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FoodConfig.class);
        HeadChef chef = context.getBean("cookerJob", HeadChef.class);
        System.out.println(chef.makeFood());
        System.out.println(chef.sellFood());
    }
}
