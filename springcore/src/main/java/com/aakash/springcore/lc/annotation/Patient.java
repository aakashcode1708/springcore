package com.aakash.springcore.lc.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
//life cycle methods
public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@PostConstruct
	public void init() {
		System.out.println("init method calling....");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy method calling...");
	}
}
