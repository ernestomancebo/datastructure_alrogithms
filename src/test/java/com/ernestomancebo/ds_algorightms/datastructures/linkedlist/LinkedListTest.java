package com.ernestomancebo.ds_algorightms.datastructures.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

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

	@Test
	public void testFindItem() {
		assertNotNull(getBaseLinkedList().search(5));
	}

	@Test
	public void testItemNotFound() {
		assertNull(getBaseLinkedList().search(45));
	}

	@Test
	public void testDeleteSpecificNode() {
		LinkedList linkedList = getBaseLinkedList();

		linkedList.deleteSpecificNode(5);
		assertEquals(2, linkedList.length());
		assertEquals("{ data: 3, data: 12 }", linkedList.toString());
	}
	
	@Test
	public void testDeleteSpecificNodeAtHead() {
		LinkedList linkedList = getBaseLinkedList();

		linkedList.deleteSpecificNode(3);
		assertEquals(2, linkedList.length());
		assertEquals("{ data: 5, data: 12 }", linkedList.toString());
	}

	private final LinkedList getBaseLinkedList() {
		LinkedList linkedList = new LinkedList();

		linkedList.insertAtHead(12);
		linkedList.insertAtHead(5);
		linkedList.insertAtHead(3);

		return linkedList;
	}
}
