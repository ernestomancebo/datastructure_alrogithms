package com.ernestomancebo.ds_algorightms.datastructures.sortedlinkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ernestomancebo.ds_algorightms.datastructures.linkedlist.Node;

public class SortedLinkedListTest {
	@Test
	public void testInsertAtHead() {
		SortedLinkedList sortedLinkedList = getBasesortedLinkedList();

		assertEquals("{ data: 0, data: 2, data: 12, data: 25, data: 99 }", sortedLinkedList.toString());
	}
	
	private final SortedLinkedList getBasesortedLinkedList() {
		SortedLinkedList sortedLinkedList = new SortedLinkedList();

		sortedLinkedList.insertNode(new Node(12));
		sortedLinkedList.insertNode(new Node(2));
		sortedLinkedList.insertNode(new Node(25));
		sortedLinkedList.insertNode(new Node(0));
		sortedLinkedList.insertNode(new Node(99));

		return sortedLinkedList;
	}
}
