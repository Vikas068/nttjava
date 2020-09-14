package com.nttdata;

public class Exception {
	
	public static void main(String[] args) {
		
		try {
			
			int a=2,b=0,c;
			
			c=a/b;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}

}
