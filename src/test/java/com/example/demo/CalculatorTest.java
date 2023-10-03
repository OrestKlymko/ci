package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

	@Test
	void testAddition() {
		assertEquals(10, Calculator.add(5, 5));
	}

	@Test
	void testSubtraction() {
		assertEquals(5, Calculator.subtract(10, 5));
	}

	@Test
	void testMultiplication() {
		assertEquals(25, Calculator.multiply(5, 5));
	}

	@Test
	void testDivision() {
		assertEquals(2, Calculator.divide(10, 5));
	}

	@Test
	void testDivisionByZero() {
		assertThrows(ArithmeticException.class, () -> Calculator.divide(10, 0));
	}
}
