package com.nttdata;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ParralleRunner {
	
	public static void main(String[] args) {
		
		
		Result result=JUnitCore.runClasses(ParallelFor.class, ParallelWhile.class);
		
		System.out.println("Ran : "+result.getRunCount());
		System.out.println("Ignore : "+result.getIgnoreCount());
		System.out.println("Time : "+result.getRunTime());
		System.out.println("Failures  : "+result.getFailures());
		
		for(Failure failure: result.getFailures())
			
		{
			System.out.println(failure);
			
		}
	}

}
