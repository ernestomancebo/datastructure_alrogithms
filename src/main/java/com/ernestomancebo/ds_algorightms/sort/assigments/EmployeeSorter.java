package com.ernestomancebo.ds_algorightms.sort.assigments;

public class EmployeeSorter {

	/*
	 * Do an insertion sort
	 */
	public void sort(Employee[] data) {
		for (int i = 0; i < data.length; i++) {
			Employee currentEmployee = data[i];
			int j = i - 1;

			while (j >= 0 && data[j]._id > currentEmployee._id) {
				data[j + 1] = data[j];
				j--;
			}

			data[j + 1] = currentEmployee;
		}
	}

	/*
	 * Find the index where to insert
	 */
	public int findInsertIndex(Employee[] data) {
		int insertIndex = 0;

		return insertIndex;
	}

	public void insert(int index, Employee[] data) {

	}

}
