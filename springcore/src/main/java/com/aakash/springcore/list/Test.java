package com.aakash.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/aakash/springcore/list/spring-listconfig.xml");
		Hospital hosp=(Hospital)ctx.getBean("hospital");
		System.out.println(hosp.getName());
		System.out.println(hosp.getDepartments());
	}

}
