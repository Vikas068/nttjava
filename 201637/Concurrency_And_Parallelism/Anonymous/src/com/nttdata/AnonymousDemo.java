package com.nttdata;

public class AnonymousDemo {
	
	public static void main(String[] args) {
		
		
		Sample samp=new Sample() {
			
			@Override
			public void display() {
				System.out.println("The value of x is : "+x);				
			}
		};
		
		samp.display();
		
	
		
		}

}
