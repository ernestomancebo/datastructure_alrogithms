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

	/**
	 * Does the Insertion Sort algorithm. Takes a gap interval as parameter
	 */
	public void sort(int[] data, int startPosition, int gap) {

		for (int i = startPosition; i < data.length; i += gap) {
			int currentItem = data[i];
			int j = i - gap;

			while (j >= startPosition && data[j] > currentItem) {
				data[j + gap] = data[j];
				j -= gap;
			}
			data[j + gap] = currentItem;
		}
	}

	/**
	 * Implements the Insertion Sort algorithm. 1 is the default gap interval.
	 * 
	 * @see com.ernestomancebo.ds_algorightms.sort.Sorter#sort(int[])
	 */
	public void sort(int[] data) {
		sort(data, 0, 1);
	}

}
