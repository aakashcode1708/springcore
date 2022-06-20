package com.aakash.springcore.refTypes.assign;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ApplicationContext ctx=new ClassPathXmlApplicationContext("com/aakash/springcore/refTypes/assign/refconfig.xml");
    Shopping sh=(Shopping)ctx.getBean("shopping");
    System.out.println(sh);
	}

}
