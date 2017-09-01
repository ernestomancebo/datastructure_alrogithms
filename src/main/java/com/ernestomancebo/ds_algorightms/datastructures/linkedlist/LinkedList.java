package com.ernestomancebo.ds_algorightms.datastructures.linkedlist;

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

	public int length() {
		int length = 0;
		Node currentNode = headNode;

		while (currentNode != null) {
			length++;
			currentNode = currentNode.getNextNode();

		}

		return length;
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
