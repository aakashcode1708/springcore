package com.aakash.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/aakash/springcore/set/spring-setconfig.xml");
		CarDealer car=(CarDealer)ctx.getBean("car");
		System.out.println(car.getName());
		System.out.println(car.getModels());

	}

}
