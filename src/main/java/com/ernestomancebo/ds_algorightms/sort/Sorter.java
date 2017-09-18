package com.ernestomancebo.ds_algorightms.sort;

/**
 * Every sort algorithm must have a sort method. Seems obvious.
 * 
 * @author admin
 *
 */
public interface Sorter <T extends Comparable<T>>{

	public T[] sort(T[] data);
}
