package com.nttdata;

public class RunEmployee {
	
	public static void main(String[] args) {
		
		Employee e=new Employee();
		
		e.setEmpId(201637);
		e.setName("Vikas");
		e.setSalary(10000);
		e.setSsn("122");
		
		System.out.println("Below are the employee details");
		
		System.out.println("Employee Id is: "+e.getEmpId());
		System.out.println("Employee name is: "+e.getName());
		System.out.println("Employee SSN is: "+e.getSsn());
		System.out.println("Employee salary is: "+e.getSalary());
	}

}
