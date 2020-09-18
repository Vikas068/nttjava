package com.nttdata;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demosort {
	
	public static void main(String[] args) {
		
		
		List names=Arrays.asList("Reflection","Collection","Stream");
		
		List result=(List) names.stream().sorted().collect(Collectors.toList());
		
		System.out.println(result
				);
	}

}
