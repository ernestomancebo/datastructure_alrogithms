package com.ernestomancebo.ds_algorightms.sort;

public class QuickSort<T extends Comparable<T>> implements Sorter<T> {

	public T[] sort(T[] data) {
		return sort(data, 0, data.length - 1);
	}

	/*
	 * Implement the Quick sort algorithm from the pseudo code shown in the
	 * lectures.
	 */
	public T[] sort(T[] data, int startIndex, int endIndex) {
		if (startIndex < endIndex) {
			int pivotIndex = quickSortPartition(data, startIndex, endIndex);
			sort(data, startIndex, pivotIndex - 1);
			sort(data, pivotIndex + 1, endIndex);
		}

		return data;
	}

	/*
	 * Implement the Shell sort algorithm.
	 */

	private int quickSortPartition(T[] data, int startIndex, int endIndex) {
		T pivot = data[endIndex];
		int rightIndex = startIndex;
		T tmp = null;

		for (int left = startIndex; left < endIndex; left++) {
			if (data[left].compareTo(pivot) < 0) {
				tmp = data[rightIndex];
				data[rightIndex] = data[left];
				data[left] = tmp;

				rightIndex++;
			}
		}

		tmp = data[rightIndex];
		data[rightIndex] = pivot;
		data[endIndex] = tmp;

		return rightIndex;
	}

}
