package com.ernestomancebo.ds_algorightms.sort;

public class BinarySearch {

	public int search(int item, int[] data) {
		return search(item, data, 0, data.length - 1);
	}

	public int search(int item, int[] data, int indexLeft, int indexRight) {
		if (indexRight >= indexLeft) {
			int middle = indexLeft + ((indexRight - indexLeft) / 2);

			// If is the data at the middle, then it's found
			if (data[middle] == item) {
				return middle;
			}

			// If the middle and up is bigger, search at the beginning of the
			// list
			if (data[middle] > item) {
				return search(item, data, indexLeft, middle - 1);
			} else {
				// Else, is lower and gotta search middle and up
				return search(item, data, middle + 1, indexRight);
			}
		}

		// If
		return -1;
	}
}
