package com.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberCalculationTest {
	
	NumberCalculation nc= new NumberCalculation();
	
	@Test
	public void testCase(){
		
		assertEquals(nc.add(1,2),3);
		
	}
	
	@Test
	public void testCase1(){
		
		assertEquals(nc.convertCase("hello"),"HELLO");
		
	}
	/*@Test
	public void testCase1(){
		
	}
	@Test
	public void testCase2(){
		
	}
	@Test
	public void testCase3(){
		
	}*/
	
}
