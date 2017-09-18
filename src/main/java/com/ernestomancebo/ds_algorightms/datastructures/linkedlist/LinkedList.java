package com.ernestomancebo.ds_algorightms.datastructures.linkedlist;

import com.ernestomancebo.ds_algorightms.datastructures.linkedlist.node.Node;

public class LinkedList {
	private Node headNode;

	public void insertAtHead(int data) {
		Node node = new Node(data);
		node.setNextNode(headNode);
		this.headNode = node;
	}

	public void deleteFromHead() {
		headNode = headNode.getNextNode();
	}

	public void deleteSpecificNode(int dataToDelete) {
		Node currentNode = headNode;
		Node previousNode = null;

		while (currentNode != null) {
			if (currentNode.getData() == dataToDelete) {
				// If is the head node
				if (previousNode == null) {
					deleteFromHead();
				} else {
					previousNode.setNextNode(currentNode.getNextNode());
				}
			}
			previousNode = currentNode;
			currentNode = currentNode.getNextNode();
		}

	}

	public int length() {
		int length = 0;
		Node currentNode = headNode;

		while (currentNode != null) {
			length++;
			currentNode = currentNode.getNextNode();

		}

		return length;
	}

	public Node search(int item) {
		Node currentNode = headNode;
		while (currentNode != null) {
			if (currentNode.getData() == item) {
				return currentNode;
			}
			currentNode = currentNode.getNextNode();
		}

		return null;
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
