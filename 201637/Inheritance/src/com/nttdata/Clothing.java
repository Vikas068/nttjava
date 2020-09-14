package com.nttdata;

public class Clothing {
	
	private int itemId;
	private String desc="description required";
	private char colorcode='U';
	private double price=0.0;
	
	//constructors.
	public Clothing(int itemId, String desc, char colorcode, double price) {
		super();
		this.itemId = itemId;
		this.desc = desc;
		this.colorcode = colorcode;
		this.setPrice(price);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void display()
	{
		System.out.println("item id is :"+itemId);
		System.out.println("Description is : "+desc);
		System.out.println("colorcode is : "+colorcode);
		System.out.println("price is : "+price);
	}
	
	
	
	
	

}
