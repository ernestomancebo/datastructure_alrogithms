package com.ernestomancebo.ds_algorightms.sort;

public class ShellSort<T extends Comparable<T>> implements Sorter<T> {

	public T[] sort(T[] array) {
		InsertionSort<T> sorter = new InsertionSort<>();
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

		return array;
	}
}
