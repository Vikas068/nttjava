package com.nttdata;

public class Weather {
	
	private int answer;
	
	public boolean willRainToday()
	{
		return answer%2==0;
		
	}
	
	public boolean isitSunnyToday()
	{
		return answer%3==0;
	}
	
	public boolean isitFreezingToday()
	{
		return answer%5 == 3;
	}

}
