package com.nttdata;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Democollect {
	
	public static void main(String[] args) {
		
		
		List names=Arrays.asList(2,3,4,5);
		
		List results=(List) names.stream().map(x->x*x).collect(Collectors.toSet());
		System.out.println(results);
		
	}

}
