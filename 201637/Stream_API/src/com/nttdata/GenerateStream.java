package com.nttdata;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class GenerateStream {
	
	public static void main(String[] args) {
		
		List<String> strings=Arrays.asList("Vikas","Patil");
		
		List<String> filtered=strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		
		System.out.println(filtered);
		
		//forEach.
		
		Random random=new Random();
		random.ints().limit(10).forEach(System.out::println);
		
		//maps.
		List<Integer> maps=Arrays.asList(1,2,3,4);
		
		List<Integer> squareList=maps.stream().map(i->i*i).distinct().collect(Collectors.toList());
		
		System.out.println(squareList);
		
	}

}
