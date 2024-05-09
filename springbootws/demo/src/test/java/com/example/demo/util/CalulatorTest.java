package com.example.demo.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalulatorTest {
	public static Calculator calculator;
	@BeforeAll
	public static void before() {
		calculator = new Calculator();
		System.out.println("Before All");
	}
	@AfterAll
	public static void after() {
		System.out.println("After All");
	}
	@Test
	public void testAdd() {
		assertEquals(10, calculator.add(5, 5));
		System.out.println("test metod test call");
	}
	
	@Test
	public void testAddZero() {
		assertEquals(0,calculator.add(0, 5));
		System.out.println("testAddZero method test call");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("before Each");
	}
	@AfterEach
	public void afterEach() {
		System.out.println("After Each");
	}
	
}
