package com.nttdata;

public class Employee {
	
	//private fields.
	
	private int empId;
	private String name;
	private String ssn;
	private long salary;
	
	public void Employee()
	{
		System.out.println("Employee empty constructor is working.");
	}
	
	public void Employee(int empId,String name,String ssn,long salary)
	{
		this.empId=empId;
		this.name=name;
		this.ssn=ssn;
		this.salary=salary;
		
	}
	
	//creating the setter and getters.

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
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
	
	
	

}
