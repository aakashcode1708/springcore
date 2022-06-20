package com.aakash.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring-config.xml");
Employee emp=(Employee)ctx.getBean("emp");
System.out.println("ID: "+emp.getId());
System.out.println("Name: "+emp.getName());
}
}
