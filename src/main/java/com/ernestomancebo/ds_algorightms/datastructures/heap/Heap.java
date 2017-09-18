package com.ernestomancebo.ds_algorightms.datastructures.heap;

import java.util.Arrays;

public class Heap<T extends Comparable<T>> {

	private int initial_capacity = 10;
	private int size = 0;
	private Comparable<T>[] heap = new Comparable[initial_capacity];

	public Heap() {
	}

	public Comparable<T> peek() {
		if (size == 0) {
			throw new IllegalStateException("Heap is empty");
		}

		return heap[0];
	}

	public Comparable<T> poll() {
		if (size == 0) {
			throw new IllegalStateException("Heap is empty");
		}

		Comparable<T> rootItem = heap[0];
		heap[0] = heap[size - 1];
		size--;

		heapifyDown();

		return rootItem;
	}

	public void add(T newElement) {
		ensureCapacity();
		heap[size] = newElement;
		size++;

		heapifyUp();
	}

	private void heapifyDown() {
		int index = 0;

		while (hasLeftChild(index)) {
			int smallChildIndex = getLeftChildIndex(index);
			if (hasRightChild(index) && getRightChild(index).compareTo((T) getLeftChild(index)) < 0) {
				smallChildIndex = getRightChildIndex(index);
			}

			if (heap[index].compareTo((T) heap[smallChildIndex]) < 0) {
				break;
			} else {
				swap(index, smallChildIndex);
			}

			index = smallChildIndex;
		}

	}

	private void heapifyUp() {
		int index = size - 1;

		while (hasParent(index)
				&& getParent(index).compareTo((T) heap[index]) >= 0) {
			int parentIndex = getParentIndex(index);
			swap(parentIndex, index);

			index = parentIndex;
		}
	}

	private void swap(int fromIndex, int toIndex) {
		Comparable<T> tmp = heap[toIndex];

		heap[toIndex] = heap[fromIndex];
		heap[fromIndex] = tmp;
	}

	private void ensureCapacity() {
		if (size == initial_capacity) {
			heap = Arrays.copyOf(heap, initial_capacity * 2);
			initial_capacity *= 2;
		}
	}

	// HEAP ACCESSORS

	private Comparable<T> getLeftChild(int parentIndex) {
		return heap[getLeftChildIndex(parentIndex)];
	}

	private Comparable<T> getRightChild(int parentIndex) {
		return heap[getRightChildIndex(parentIndex)];
	}

	private Comparable<T> getParent(int childIndex) {
		return heap[getParentIndex(childIndex)];
	}

	private boolean hasLeftChild(int parentIndex) {
		return getLeftChildIndex(parentIndex) < size;
	}

	private boolean hasRightChild(int parentIndex) {
		return getRightChildIndex(parentIndex) < size;
	}

	private boolean hasParent(int childIndex) {
		return getParentIndex(childIndex) >= 0;
	}

	private int getLeftChildIndex(int parentIndex) {
		return 2 * parentIndex + 1;
	}

	private int getRightChildIndex(int parentIndex) {
		return 2 * parentIndex + 2;
	}

	private int getParentIndex(int childIndex) {
		return (childIndex - 1) / 2;
	}
}
