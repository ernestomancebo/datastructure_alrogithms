package com.ernestomancebo.ds_algorightms.sort;

/**
 * This algorithm iterates an array towards the left. Evaluates the current
 * element against the elements at the right seeking for a lower element and
 * putting after it otherwise, place it at the beginning of the list declaring
 * it as the smallest element. Every element evaluated is switched to the right.
 * 
 * @author Ernesto Mancebo
 *
 */
public class InsertionSort implements Sorter {

	public void sort(int[] data) {

		for (int i = 0; i < data.length; i++) {
			int currentItem = data[i];
			int j = i - 1;

			while (j >= 0 && data[j] > currentItem) {
				data[j + 1] = data[j];
				j--;
			}
			data[j + 1] = currentItem;
		}
	}

}
