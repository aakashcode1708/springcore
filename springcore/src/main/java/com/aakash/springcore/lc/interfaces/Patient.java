package com.aakash.springcore.lc.interfaces;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//life cycle methods
public class Patient implements InitializingBean,DisposableBean {
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

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside after properties set");
	}
}
