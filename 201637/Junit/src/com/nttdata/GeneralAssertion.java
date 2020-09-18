package com.nttdata;

import org.junit.Test;

public class GeneralAssertion {
	
	private Weather weather=new Weather();
	
	@Test
	public void showAssertTrue()
	{
		assert("no rain today",weather.isitFreezingToday() && weather.isitSunnyToday());
		System.out.println("ok, test the rainbow stuff");
		
	}
	
	@Test
	public void showAssert()
	{
		assert("unsafe to drive",!(weather.isitFreezingToday() &&  weather.willRainToday()));
		
	}
	
	@Test
	public void showFail()
	{
		if(weather.isitFreezingToday() || weather.willRainToday())
		{
			fail("weather is bad, call off our plans."
					+ "");
		}
			
	}

}
