package com.aakash.springcore.lc.annotation.assign;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("com/aakash/springcore/lc/annotation/assign/config.xml");
		TicketReservation tic=(TicketReservation)ctx.getBean("ticket");
		System.out.println(tic.getTicketId());
		ctx.registerShutdownHook();

	}

}
