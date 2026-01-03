package com.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoginServiceTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	System.out.println("it execute before all test start --only one time");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("it execute after all test finish --only one time");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("it execute before each test");
	}

	@After
	public void tearDown() throws Exception {
	System.out.println("it execute after each test");
	}
	

	@Test
	public void testCheckLoginDetails() {
		System.out.println("login testing ");
		LoginService ls = new LoginService();
		boolean result1 = ls.checkLoginDetails("admin@gmail.COM", "admin@123");
		assertTrue(result1);
		
		boolean result2 = ls.checkLoginDetails("admin@gmail.COM", "admin@gmail.com");
		assertFalse(result2);
	}

	@Test
	public void testGreet() {
		System.out.println("greet message testing");
		LoginService ls = new LoginService();
		String result = ls.greet("raj@gmail.com");
		assertEquals("Welcome raj@gmail.com", result);
	}

}
