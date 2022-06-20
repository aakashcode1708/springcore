package com.aakash.springcore.refTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("com/aakash/springcore/refTypes/refconfig.xml");
	Student st=(Student)ctx.getBean("student");
	System.out.println(st);
}
}
