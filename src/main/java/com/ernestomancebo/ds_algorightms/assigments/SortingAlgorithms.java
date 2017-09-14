package com.ernestomancebo.ds_algorightms.assigments;

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

	/*
	 * Get Knuth sequence for Shell sort
	 */
	private int getKnuthSequence(int n) {
		return (3 * n + 1);
	}
}
