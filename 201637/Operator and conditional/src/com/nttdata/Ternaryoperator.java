package com.nttdata;

public class Ternaryoperator {
	
	public static void main(String[] args) {
		
		int numberofgoals=1;
		
		String s=(numberofgoals==1 ? "goal":"goals");
		
		System.out.println("I score "+numberofgoals+" "+s);
		
		
		///condition oprerators.
		
		int x=9,y=3;
		
		if(x/y<3)
		{
			x+=y;
		}
		else
		{
			x*=y;
		}
		
		System.out.println("The value of x is: "+x);
		
		//Ternary operator for the same operation.
		
		System.out.println("Ternary operation.");
		
		int a=4,b=2;
		
		x=((a/b<3) ? (a+=b):(a*=b));
		
		System.out.println("The value of a is: "+a);
	}

}
