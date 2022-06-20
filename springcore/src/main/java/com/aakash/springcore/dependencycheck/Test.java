package com.aakash.springcore.dependencycheck;

import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("com/aakash/springcore/dependencycheck/config.xml");
	Prescription pres=(Prescription)ctx.getBean("presc");
	System.out.println(pres);

}
}
