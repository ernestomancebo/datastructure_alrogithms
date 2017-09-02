package com.ernestomancebo.ds_algorightms.datastructures.sortedlinkedlist;

import com.ernestomancebo.ds_algorightms.datastructures.linkedlist.Node;

public class SortedLinkedList {

	private Node headNode;

	public void insertNode(Node newNode) {
		Node currentNode = headNode;

		// If there's no head, then the new node is the head
		if (headNode == null) {
			headNode = newNode;
			return;
		}

		while (currentNode != null) {
			// If the head node is bigger than the new one, then the new node is the
			// head
			if (currentNode.getData() > newNode.getData()) {
				newNode.setNextNode(currentNode);
				headNode = newNode;
				break;
			}

			// If the upcoming node is bigger, then new node is equal or bigger
			// than the current node and must be placed previous to the next
			// node
			if (currentNode.getNextNode() != null && currentNode.getNextNode().getData() > newNode.getData()) {
				newNode.setNextNode(currentNode.getNextNode());
				currentNode.setNextNode(newNode);
				break;
			}

			// If there's no next node, then the new node has reached the end of
			// the list and it's the supreme emperor
			if (currentNode.getNextNode() == null) {
				currentNode.setNextNode(newNode);
				break;
			}

			currentNode = currentNode.getNextNode();
		}
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
