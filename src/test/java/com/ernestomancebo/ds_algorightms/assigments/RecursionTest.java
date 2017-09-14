package com.ernestomancebo.ds_algorightms.assigments;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecursionTest {
	Recursion recursion = new Recursion();

	@Test
	public void testRecursiveSum() {
		assertEquals(6, recursion.recursiveSum(6, 0));
		assertEquals(4, recursion.recursiveSum(0, 4));
		assertEquals(9, recursion.recursiveSum(6, 3));
	}

	@Test
	public void testRecursiveSquare() {
		assertEquals(55, recursion.sumOfSquare(5));
		assertEquals(91, recursion.sumOfSquare(6));
		assertEquals(1, recursion.sumOfSquare(1));
	}
}
