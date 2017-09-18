package com.ernestomancebo.ds_algorightms.sort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SelectionSortTest {

	@Test
	public void sortAssertPasses() {
		Integer[] inputValues = { 9, 3, 5, 1, 8 };
		final Integer[] resultValues = { 1, 3, 5, 8, 9 };

		SelectionSort<Integer> sorter = new SelectionSort<>();
		sorter.sort(inputValues);

		assertArrayEquals(inputValues, resultValues);
	}

}
