package com.aakash.springcore.lc.xmlconfig;

//life cycle methods
public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void init() {
		System.out.println("init method...");
	}
	public void destroy() {
		System.out.println("destroy method...");
	}
}
