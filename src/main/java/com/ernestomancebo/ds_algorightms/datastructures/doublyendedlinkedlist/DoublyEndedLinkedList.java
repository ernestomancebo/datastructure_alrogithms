package com.ernestomancebo.ds_algorightms.datastructures.doublyendedlinkedlist;

import com.ernestomancebo.ds_algorightms.datastructures.linkedlist.Node;

public class DoublyEndedLinkedList {

	private Node headNode;
	private Node tailNode;

	public void insertAtTail(Node newNode) {

		// If there's no head, the new node is the head
		if (headNode == null) {
			headNode = newNode;
		}

		// If there's a tail already, then make it a regular node
		if (tailNode != null) {
			tailNode.setNextNode(newNode);
		}

		// Either there's a tail or not, the new node is the new tail
		tailNode = newNode;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("{ ");
		Node currentNode = headNode;

		while (currentNode != null) {
			stringBuilder.append("data: ");
			stringBuilder.append(currentNode.getData());

			currentNode = currentNode.getNextNode();

			if (currentNode != null) {
				stringBuilder.append(", ");
			}
		}

		stringBuilder.append(" }");

		return stringBuilder.toString();
	}
}
