package org.j2eedev.math;
/*
 *  
 * http://j2eedev.org
 * Beginer JUnit Tutorial
 * */


import org.j2eedev.calc.NumberWords;

import junit.framework.TestCase;


public class MathTest extends TestCase {

	private int value1;
	private int value2;

	public MathTest(String testName) {
		super(testName);
	}

	protected void setUp() throws Exception {
		super.setUp();
		value1 = 8;
		value2=25;	
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		value1 = 0;
		value2 = 0;
	}
	NumberWords numberWords=new NumberWords();
	public void testAdd() {
		String  total = "Eight";		
		String result=numberWords.toWords(value1);
		assertEquals(result, total);
	}
	
	public void testAdd1() {
		String  total = "Twenty Five";		
		String result=numberWords.toWords(value2);
		assertEquals(result, total);
	}
	
	public void testAdd2() {
		String  total = "One Hundred Fifty";		
		String result=numberWords.toWords(150);
		assertEquals(result, total);
	}
	
	public void testAdd3() {
		String  total = "enter the number in between 1 to 1000";		
		String result=numberWords.toWords(1200);
		assertEquals(result, total);
	}
	public void testFailedAdd() {
		String total = "Enter the number above one";
		String result=numberWords.toWords(-1);
		assertEquals(result, total);
	}
	/*//Invalid number
	public void testInvalid() {
		String total = "Invalid number";
		//int s=Integer.parseInt(Integer.parseInt("h"));//
		String result=numberWords.toWords(Integer.parseInt("f"));
		assertEquals(result, total);
		
	}	*/


}
