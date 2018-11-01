package com.jUnit010Basics.basics030equalsCompare;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCompare_junit4 {
	private salary;
	private Book book2;
	private Book book3;
	private Book book4;
	
	@Before
	public void initBeforeTest() throws Exception 
	{
		System.out.println("\tRun initBeforeTest()");
		int salary=350000;
		double tax_rate=0.085		
	}
	
	@After
	public void cleanAfterTest() throws Exception {
	System.out.println("\tRun initBeforeTest()");
	int salary=null;
	double tax_rate=null;
	}

	@Test
	public void testAdd1() {	
		SalaryCalculator sc = new SalaryCalculator();
		double salarytax = sc.calcTax(salary,tax_rate);
		assertEquals(4250, salarytax, 0);
	}
	
}
