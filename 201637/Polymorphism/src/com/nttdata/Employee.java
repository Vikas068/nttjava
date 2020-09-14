package com.nttdata;

public class Employee {
	
	private int empid;
	private String name;
	private String ssn;
	private long salary;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Employee(int empid, String name, String ssn, long salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}
	
	public String toString()
	{
		return "Employee id: "+getEmpid()+"Employee name: "+getName()+"Employee SSN: "+getSsn()+"Employee salary is: "+getSalary();
	}

}
