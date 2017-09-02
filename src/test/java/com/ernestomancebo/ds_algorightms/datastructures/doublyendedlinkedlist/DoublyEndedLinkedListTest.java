package com.ernestomancebo.ds_algorightms.datastructures.doublyendedlinkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ernestomancebo.ds_algorightms.datastructures.doublyendedlinkedlist.DoublyEndedLinkedList;
import com.ernestomancebo.ds_algorightms.datastructures.linkedlist.Node;

public class DoublyEndedLinkedListTest {

	@Test
	public void testInsertAtTailSingleNode() {
		DoublyEndedLinkedList doublyEndedLinkedList = new DoublyEndedLinkedList();
		doublyEndedLinkedList.insertAtTail(new Node(12));
		assertEquals("{ data: 12 }", doublyEndedLinkedList.toString());
	}
	
	@Test
	public void testInsertAtTail() {
		DoublyEndedLinkedList doublyEndedLinkedList = getBaseDoublyEndedLinkedList();

		assertEquals("{ data: 12, data: 5, data: 3 }", doublyEndedLinkedList.toString());
	}
	
	private final DoublyEndedLinkedList getBaseDoublyEndedLinkedList() {
		DoublyEndedLinkedList doublyEndedLinkedList = new DoublyEndedLinkedList();

		doublyEndedLinkedList.insertAtTail(new Node(12));
		doublyEndedLinkedList.insertAtTail(new Node(5));
		doublyEndedLinkedList.insertAtTail(new Node(3));

		return doublyEndedLinkedList;
	}
}
