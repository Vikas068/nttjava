package com.nttdata;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
	
	public static void main(String[] args) {
		int x;
		
		List number=Arrays.asList(2,3,4,5);
		
		List square=(List) number.stream().map(x->x*x).collect(Collectors.toList());
		
		
	}

}
