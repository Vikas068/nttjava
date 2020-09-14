package com.nttdata;

import java.util.Arrays;
import java.util.List;

public class ListInterface {
	public static void main(String[] args) {
		
	
	
	String[] name= {"One","Two","Three"};

	System.out.println("Before the ArrayList conversion");
	System.out.println(name);
	
	List<String> mylist=Arrays.asList(name);
	
	System.out.println("After arraylist conversion");
	for(String names:mylist)
	{
		System.out.println(names);
		
	}

}
}