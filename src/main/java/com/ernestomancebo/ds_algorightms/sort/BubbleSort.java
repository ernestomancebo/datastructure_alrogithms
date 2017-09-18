package com.ernestomancebo.ds_algorightms.sort;

public class BubbleSort <T extends Comparable<T>> implements Sorter<T> {

	public T[] sort(T[] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length - i - 1; j++) {
				if (data[j].compareTo(data[j + 1]) > 0) {
					T tmp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = tmp;
				}
			}
		}

		return data;
	}

}
