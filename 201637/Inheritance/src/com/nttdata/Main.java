package com.nttdata;

public class Main {
	public static void main(String[] args) {
		
		
		Shirt sh=new Shirt(10,"vikas",'U',15);
		sh.getFit();
		
		
		Clothing cl=new Clothing(10, "product is valid", 'U', 250);
		cl.display();
		
	}

}
