package com.ernestomancebo.ds_algorightms.assigments;

import com.ernestomancebo.ds_algorightms.sort.InsertionSort;

public class SortingAlgorithms {

	/*
	 * Implement the Quick sort algorithm from the pseudo code shown in the
	 * lectures.
	 */
	public void quickSort(int[] array, int startIndex, int endIndex) {
		if (startIndex < endIndex) {
			int pivotIndex = quickSortPartition(array, startIndex, endIndex);
			quickSort(array, startIndex, pivotIndex - 1);
			quickSort(array, pivotIndex + 1, endIndex);
		}
	}

	/*
	 * Implement the Shell sort algorithm.
	 */

	private int quickSortPartition(int[] array, int startIndex, int endIndex) {
		int pivot = array[endIndex];
		int rightIndex = startIndex;
		int tmp = -1;

		for (int left = startIndex; left < endIndex; left++) {
			if (array[left] < pivot) {
				tmp = array[rightIndex];
				array[rightIndex] = array[left];
				array[left] = tmp;

				rightIndex++;
			}
		}

		tmp = array[rightIndex];
		array[rightIndex] = pivot;
		array[endIndex] = tmp;

		return rightIndex;
	}

	public void shellSort(int[] array) {
		InsertionSort sorter = new InsertionSort();
		int gap = Math.floorDiv(array.length, 2);
		int start = 0;

		while (gap > 0) {
			if (gap == 1) {
				start = 0;
			}

			sorter.sort(array, start, gap);
			start = start + 1;
			gap = Math.floorDiv(gap, 2);
		}
	}

	public int[] countingSort(int[] array) {
		if (array.length < 1) {
			return array;
		}

		int maxInArray = maxFromArray(array);
		int[] tmpCounterArray = new int[maxInArray + 1];
		int[] returnArray = new int[array.length];
		int returnCounter = 0;

		for (int i = 0; i < array.length; i++) {
			tmpCounterArray[array[i]]++;
		}

		for (int i = 0; i < tmpCounterArray.length; i++) {
			while (tmpCounterArray[i] > 0) {
				returnArray[returnCounter] = i;

				returnCounter++;
				tmpCounterArray[i]--;
			}
		}
		return returnArray;
	}

	private int maxFromArray(int[] array) {
		int max = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}

		return max;
	}

}
