package com.nttdata;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2filter {
	
	public static void main(String[] args) {
		
		
		List names=Arrays.asList("Reflection","Collection","Stream");
		
		List result=(List) names.stream().filter(s->((String) s).startsWith("S")).collect(Collectors.toList());
	   
		System.out.println(result);
		
		
	}

}
