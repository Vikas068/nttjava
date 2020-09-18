package com.nttdata;

import org.junit.Test;

public class ParallelWhile {
	
	
	@Test
	public void runnable()
	{
		int i=0;
		while(i<100)
		{
			i++;
			System.out.println("While: "+i);
		}
	}

}
