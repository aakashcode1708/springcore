package com.aakash.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("com/aakash/springcore/properties/propsconfig.xml");
	LanguagesAndCountries lang=(LanguagesAndCountries)ctx.getBean("countries");
	System.out.println(lang);
}
}
