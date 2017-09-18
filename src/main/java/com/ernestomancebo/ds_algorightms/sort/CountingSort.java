package com.ernestomancebo.ds_algorightms.sort;

import java.util.Arrays;

public class CountingSort implements Sorter<Integer> {

	public Integer[] sort(Integer[] data) {
		if (data.length < 1) {
			return data;
		}

		Integer maxInArray = maxFromArray(data);
		Integer[] tmpCounterArray = new Integer[maxInArray + 1];
		Integer[] returnArray = new Integer[data.length];
		int returnCounter = 0;

		Arrays.fill(tmpCounterArray, 0);

		for (int i = 0; i < data.length; i++) {
			tmpCounterArray[data[i]]++;
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

	private Integer maxFromArray(Integer[] data) {
		Integer max = data[0];

		for (int i = 1; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}

		return max;
	}

}
