package com.nttdata;

public class Mobile implements ElectronicDevice{
	
	@Override
	public void turnon() {
		
		System.out.println("turning on the mobile");
		
	}
	
	@Override
	public void turnoff() {
		System.out.println("turning off the mobile");
		
		
	}

}
