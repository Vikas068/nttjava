package com.nttdata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FirstJunit {

	@Test
	void test() {
		assertTrue(true);

     System.out.println("Started");
     int x=4,y=5,z=0;
     
     z=x+y;
     if(z==9)
     {
     assertTrue(true);
     }
     else
     {
    	 fail();
     }
	}

}
