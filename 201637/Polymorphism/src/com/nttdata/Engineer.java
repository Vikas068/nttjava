package com.nttdata;

public class Engineer {
	
	private int Engineerid;
	private String dept;
	public int getEngineerid() {
		return Engineerid;
	}
	public void setEngineerid(int engineerid) {
		Engineerid = engineerid;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Engineer [Engineerid is : " + Engineerid + ", dept name is: " + dept + "]";
	}
	public Engineer(int engineerid, String dept) {
		super();
		Engineerid = engineerid;
		this.dept = dept;
	}
	
	

}
