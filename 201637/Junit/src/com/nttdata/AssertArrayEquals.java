package com.nttdata;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@isMethodOrder(MethodSorters.NAME_ASCENDING)
class AssertArrayEquals {

	@Test
	public void a_NotEquals() {
		//fail("Not yet implemented");
		int[] first= {1,2,3};
		int[] someOne=first;
		assertEquals("Two array pointers",first,someOne);
		int[] second={1,2,3};
		assertEquals("Two equal arrays",first,second);
	}
	
	@Test
	public void b_ArrayEquals()
	{
		int[] first= {1,2,3};
		int[] second= {1,2,3};
		
		assertEquals(first,second);
	}
	
	
	
	
	

}
