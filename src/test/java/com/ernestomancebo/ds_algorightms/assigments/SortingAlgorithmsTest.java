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

	@Test
	public void testShellSort() {
		// First group
		int[] unsortedArray1 = { 8, 5, 18, 45, 77, 65, 9, 5 };
		int[] sortedArray1 = { 5, 5, 8, 9, 18, 45, 65, 77 };

		// Second group
		int[] unsortedArray2 = { 9, 3, 5, 1, 8 };
		final int[] sortedArray2 = { 1, 3, 5, 8, 9 };

		sortingAlg.shellSort(unsortedArray1);
		assertArrayEquals(sortedArray1, unsortedArray1);

		sortingAlg.shellSort(unsortedArray2);
		assertArrayEquals(sortedArray2, unsortedArray2);
	}

	@Test
	public void testCountingSort() {
		int[] unsortedArray = { 8, 5, 18, 45, 77, 65, 9, 5 };
		int[] sortedArray = { 5, 5, 8, 9, 18, 45, 65, 77 };

		int[] resultArray = sortingAlg.countingSort(unsortedArray);
		assertArrayEquals(sortedArray, resultArray);
	}
}
