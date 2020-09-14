package com.nttdata;

public class Manager {
	
	private int mgrid;
	private String name;
	private long salary;
	public int getMgrid() {
		return mgrid;
	}
	public void setMgrid(int mgrid) {
		this.mgrid = mgrid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Manager(int mgrid, String name, long salary) {
		super();
		this.mgrid = mgrid;
		this.name = name;
		this.salary = salary;
	}
	
	
	public String toString()
	{
		return "manager id is:"+getMgrid()+"Manager name"+getName()+"Salary is"+getSalary();
	}

}
