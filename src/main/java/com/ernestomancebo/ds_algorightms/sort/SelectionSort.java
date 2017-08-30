package com.ernestomancebo.ds_algorightms.sort;

/**
 * 
 * This algorithm takes each element from an array, compares it against the
 * following elements on the array seeking for the smallest item in the list.
 * Finally, swaps the element on turn with the smallest
 * 
 * @author Ernesto Mancebo
 *
 */
public class SelectionSort implements Sorter {

	public void sort(int[] data) {
		for (int i = 0; i < data.length - 1; i++) {
			int indexOfSmallest = i;

			for (int j = i + 1; j < data.length; j ++) {
				if (data[j] < data[indexOfSmallest]) {
					indexOfSmallest = j;
				}
			}
			
			int tmp = data[i];
			data[i] = data[indexOfSmallest];
			data[indexOfSmallest] = tmp;
		}
	}

}
