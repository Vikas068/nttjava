package com.nttdata;

public class Main {
	public static void main(String[] args) {
		
		
		Employee e=new Employee(101,"Vikas","123-45",10000);
		Manager m=new Manager(101, "Mr.Smith", 50000);
		Engineer e1=new Engineer(100,"HR");
		
		System.out.println(e.toString());
		System.out.println(m.toString());
		System.out.println(e1.toString());
	}

}
