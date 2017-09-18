package com.ernestomancebo.ds_algorightms.assigments;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ernestomancebo.ds_algorightms.sort.CountingSort;
import com.ernestomancebo.ds_algorightms.sort.QuickSort;
import com.ernestomancebo.ds_algorightms.sort.ShellSort;

public class SortingAlgorithmsTest {

	@Test
	public void testQuickSort() {
		Integer[] unsortedArray = { 8, 5, 18, 45, 77, 65, 9, 5 };
		Integer[] sortedArray = { 5, 5, 8, 9, 18, 45, 65, 77 };
		QuickSort<Integer> quickSort = new QuickSort<>();

		quickSort.sort(unsortedArray, 0, unsortedArray.length - 1);
		assertArrayEquals(sortedArray, unsortedArray);
	}

	@Test
	public void testShellSort() {
		ShellSort<Integer> shellSort = new ShellSort<>();

		// First group
		Integer[] unsortedArray1 = { 8, 5, 18, 45, 77, 65, 9, 5 };
		Integer[] sortedArray1 = { 5, 5, 8, 9, 18, 45, 65, 77 };

		// Second group
		Integer[] unsortedArray2 = { 9, 3, 5, 1, 8 };
		final Integer[] sortedArray2 = { 1, 3, 5, 8, 9 };

		shellSort.sort(unsortedArray1);
		assertArrayEquals(sortedArray1, unsortedArray1);

		shellSort.sort(unsortedArray2);
		assertArrayEquals(sortedArray2, unsortedArray2);
	}

	@Test
	public void testCountingSort() {
		Integer[] unsortedArray = { 8, 5, 18, 45, 77, 65, 9, 5 };
		Integer[] sortedArray = { 5, 5, 8, 9, 18, 45, 65, 77 };
		CountingSort countingSort = new CountingSort();

		Integer[] resultArray = countingSort.sort(unsortedArray);
		assertArrayEquals(sortedArray, resultArray);
	}
}
