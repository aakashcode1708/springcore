package com.aakash.springcore.lc.annotation.assign;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
private int ticketId;

public int getTicketId() {
	return ticketId;
}

public void setTicketId(int ticketId) {
	this.ticketId = ticketId;
}
@PostConstruct
public void init() {
	System.out.println("init calling..");
}
@PreDestroy
public void destroy() {
	System.out.println("destroy calling....");
}
}
