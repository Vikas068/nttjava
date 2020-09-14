package com.nttdata;

public class Shirt extends Clothing {
	private char fit='U';
	
	public Shirt(int itemId, String desc, char colorcode, double price) {
		super(itemId, desc, colorcode, price);
		// TODO Auto-generated constructor stub
		this.fit=fit;
	}

	public char getFit() {
		return fit;
	}

	public void setFit(char fit) {
		this.fit = fit;
	}
	
	
	
	
	
	

}
