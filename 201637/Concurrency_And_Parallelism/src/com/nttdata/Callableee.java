package com.nttdata;

import java.util.concurrent.Callable;

public class Callableee implements Callable {
	
	
		
	
	
	private final String name;
	private final int len;
	private int sum=0;
	
	
	
	

	public Callableee(String name, int len, int sum) {
		super();
		this.name = name;
		this.len = len;
		this.sum = sum;
	}





	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		for(int i=0;i<len;i++)
		{
			System.out.println(name+":"+i);
			sum +=i;
		}
	
		return "sum: "+sum;
	}

}
