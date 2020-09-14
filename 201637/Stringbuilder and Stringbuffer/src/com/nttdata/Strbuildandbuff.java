package com.nttdata;

public class Strbuildandbuff {

	
	    // Concatenates to String 
	    public static void concat1(String s1) 
	    { 
	        s1 = s1 + "hello"; 
	    } 
	  
	    
	    public static void concat2(StringBuilder s2) 
	    { 
	        s2.append("smith"); 
	    } 
	  
	    // Concatenates to StringBuffer 
	    public static void concat3(StringBuffer s3) 
	    { 
	        s3.append("welcome"); 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	        String s1 = "world"; 
	        concat1(s1);  // s1 is not changed 
	        System.out.println("String: " + s1); 
	  
	        StringBuilder s2 = new StringBuilder("hello"); 
	        concat2(s2); // s2 is changed 
	        System.out.println("StringBuilder: " + s2); 
	  
	        StringBuffer s3 = new StringBuffer("world"); 
	        concat3(s3); // s3 is changed 
	        System.out.println("StringBuffer: " + s3); 
	   

}
}
