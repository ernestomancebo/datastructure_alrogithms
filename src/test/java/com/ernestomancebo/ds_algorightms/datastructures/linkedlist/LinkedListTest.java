package com.ernestomancebo.ds_algorightms.datastructures.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void testInsertAtHead() {
		LinkedList linkedList = getBaseLinkedList();

		assertEquals("{ data: 3, data: 5, data: 12 }", linkedList.toString());
	}
	
	@Test
	public void testLinkedListLenght() {
		assertEquals(3, getBaseLinkedList().length());
	}
	

	@Test
	public void testDeleteHeadElement() {
		LinkedList linkedList = getBaseLinkedList();		
		assertEquals(3, linkedList.length());
		
		linkedList.deleteFromHead();
		assertEquals(2, linkedList.length());
	}

	private final LinkedList getBaseLinkedList() {
		LinkedList linkedList = new LinkedList();

		linkedList.insertAtHead(12);
		linkedList.insertAtHead(5);
		linkedList.insertAtHead(3);

		return linkedList;
	}
}
