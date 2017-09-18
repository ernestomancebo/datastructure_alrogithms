package com.ernestomancebo.ds_algorightms.sort.search;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.ernestomancebo.ds_algorightms.sort.BinarySearch;

public class BinarySearchTest {

	@Test
	public void assertElementIsFoundAtRight() {
		final int[] sortedArray = { 1, 3, 5, 8, 9, 12, 23, 55, 75 };
		BinarySearch binarySearch = new BinarySearch();
		assertNotEquals(-1, binarySearch.search(55, sortedArray));
	}

	@Test
	public void assertElementIsFoundAtLeft() {
		final int[] sortedArray = { 1, 3, 5, 8, 9, 12, 23, 55, 75 };
		BinarySearch binarySearch = new BinarySearch();
		assertNotEquals(-1, binarySearch.search(3, sortedArray));
	}

	@Test
	public void assertElementIsFoundAtTheMiddle() {
		final int[] sortedArray = { 1, 3, 5, 8, 9, 12, 23, 55, 75 };
		BinarySearch binarySearch = new BinarySearch();
		assertNotEquals(-1, binarySearch.search(8, sortedArray));
	}

	@Test
	public void assertElementIsNotFound() {
		final int[] sortedArray = { 1, 3, 5, 8, 9, 12, 23, 55, 75 };
		BinarySearch binarySearch = new BinarySearch();
		assertEquals(-1, binarySearch.search(80, sortedArray));
	}
}
