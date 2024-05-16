package com.example.java8.stream.Map_FlatMap;

import java.util.List;

public class Student {

	private int sId;
	
	private String  sName;
	
	private String sEmail;
	
	private List<String> sMobile;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public List<String> getsMobile() {
		return sMobile;
	}

	public void setsMobile(List<String> sMobile) {
		this.sMobile = sMobile;
	}

	protected Student(int sId, String sName, String sEmail, List<String> sMobile) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sEmail = sEmail;
		this.sMobile = sMobile;
	}
	
	public Student() {
		System.out.println("Student class");
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sEmail=" + sEmail + ", sMobile=" + sMobile + "]";
	}
	
	
	
}
