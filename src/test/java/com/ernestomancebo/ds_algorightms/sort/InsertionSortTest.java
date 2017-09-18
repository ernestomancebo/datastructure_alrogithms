package com.ernestomancebo.ds_algorightms.sort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class InsertionSortTest {

	@Test
	public void sortAssertPasses() {
		Integer[] inputValues = { 9, 3, 5, 1, 8 };
		final Integer[] resultValues = { 1, 3, 5, 8, 9 };

		InsertionSort<Integer> sorter = new InsertionSort<>();
		sorter.sort(inputValues);

		assertArrayEquals(inputValues, resultValues);
	}
	
	@Test
	public void sortAssertGapPasses() {
		Integer[] inputValues = { 9, 3, 5, 1, 8, 2 };
		final Integer[] resultValues = { 5, 3, 8, 1, 9, 2  };

		InsertionSort<Integer> sorter = new InsertionSort<>();
		sorter.sort(inputValues, 0, 2);

		assertArrayEquals(inputValues, resultValues);
	}
}
