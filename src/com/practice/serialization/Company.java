package com.practice.serialization;

import java.io.Serializable;

public class Company implements Serializable{
	private static final long serialVersionUID = -4155874742340915025L;
	private String companyName;
	private String companyLoc;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyLoc() {
		return companyLoc;
	}
	public void setCompanyLoc(String companyLoc) {
		this.companyLoc = companyLoc;
	}
	

}
