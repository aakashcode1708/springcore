package com.aakash.springcore.lc.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/aakash/springcore/lc/annotation/spring-config.xml");
		Patient pat=(Patient)ctx.getBean("patient");
		System.out.println(pat.getId());
		ctx.registerShutdownHook();
	}
}
