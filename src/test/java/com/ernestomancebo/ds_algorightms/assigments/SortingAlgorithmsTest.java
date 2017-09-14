package com.ernestomancebo.ds_algorightms.assigments;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortingAlgorithmsTest {
	SortingAlgorithms sortingAlg = new SortingAlgorithms();

	@Test
	public void testQuickSort() {
		int[] unsortedArray = { 8, 5, 18, 45, 77, 65, 9, 5 };
		int[] sortedArray = { 5, 5, 8, 9, 18, 45, 65, 77 };

		sortingAlg.quickSort(unsortedArray, 0, unsortedArray.length - 1);
		assertArrayEquals(sortedArray, unsortedArray);
	}
}
