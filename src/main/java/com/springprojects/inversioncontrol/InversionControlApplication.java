package com.springprojects.inversioncontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class InversionControlApplication {

	public static void main(String[] args) {

		SpringApplication.run(InversionControlApplication.class, args);
		System.out.println("My app ... starting");

		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("fitness.xml");

		//


		// retrieve bean from spring container
		//Fitness fitnessTeacher = context.getBean("fitnessTeacher", Fitness.class);

		Areobics areobicTeacher = context.getBean("areobicTeacher", Areobics.class);

		// call methods on the beans
		System.out.println(areobicTeacher.teachFitnessClass());


		// new method for thr MOney management
		System.out.println(areobicTeacher.getSalary());
		System.out.println(areobicTeacher.getEmailAddress());
		System.out.println(areobicTeacher.getTeam());
	}

}
