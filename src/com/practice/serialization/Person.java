package com.practice.serialization;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = -5449976381269561070L;
	public String name;
	public String city;
	Company cmp = new Company();
	
	public void display() {
		System.out.println(name+ " live in" +city);
	}

}
