package com.ernestomancebo.ds_algorightms.assigments;

import com.ernestomancebo.ds_algorightms.datastructures.doublyendedlinkedlist.DoublyEndedLinkedList;
import com.ernestomancebo.ds_algorightms.datastructures.linkedlist.Node;

public class StacksAndQueues {

	/*
	 * Implement a stack using a linked list as an underlying data structure
	 * (instead of array) What advantage do you think will it have against using
	 * arrays? You can use a DoublyLinkedNode
	 */
	class Stack {
		private Node top;

		public Stack() {
		}

		public boolean isEmpty() {
			return top == null;
		}

		public void push(int data) {
			Node newNode = new Node(data);
			if (isEmpty()) {
				top = newNode;
			} else {
				newNode.setNextNode(top);
				top = newNode;
			}
		}

		public int pop() {
			int returnValue = peek();
			top = top.getNextNode();

			return returnValue;
		}

		public int peek() {
			if (isEmpty()) {
				throw new RuntimeException("Stack is Empty");
			}

			return top.getData();
		}
	}

	/*
	 * Implement two stacks (create a new class, TwoStack) using a single array
	 * (say of size 100 - 50 each). How will the push and pop methods change?
	 */
	class DoubleStack {
		private final int LIMIT_1 = 49;
		private final int LIMIT_2 = 99;

		private int top1 = -1, top2 = 49;
		private Object[] stack = null;

		public DoubleStack() {
			stack = new Object[100];
		}

		public boolean hasFirstReachedLimit() {
			return (top1 == LIMIT_1);
		}

		public boolean hasSecondReachedLimit() {
			return (top2 == LIMIT_2);
		}

		public boolean isFirstEmpty() {
			return top1 == -1;
		}

		public boolean isSecondEmpty() {
			return top2 == 49;
		}

		public void pushFirst(Object data) {
			if (hasFirstReachedLimit()) {
				throw new RuntimeException("First Stack has reached its limit");
			}

			stack[top1 += 1] = data;
		}

		public void pushSecond(Object data) {
			if (hasSecondReachedLimit()) {
				throw new RuntimeException("Second Stack has reached its limit");
			}

			stack[top2 += 1] = data;
		}

		// POP
		public Object popFirst() {
			Object returnValue = peekFirst();
			top1--;

			return returnValue;
		}

		public Object popSecond() {
			Object returnValue = peekSecond();
			top2--;

			return returnValue;
		}

		// PEEK
		public Object peekFirst() {
			if (isFirstEmpty()) {
				throw new RuntimeException("First Stack is empty");
			}

			Object returnValue = stack[top1];

			return returnValue;
		}

		public Object peekSecond() {
			if (isSecondEmpty()) {
				throw new RuntimeException("Second Stack is empty");
			}

			Object returnValue = stack[top2];

			return returnValue;
		}
	}

	/*
	 * Implement a queue using a linked list as an underlying data structure.
	 */

	class LinkedQueue {
		DoublyEndedLinkedList queue;

		public LinkedQueue() {
			queue = new DoublyEndedLinkedList();
		}

		// ENQUEUE
		public void enqueue(int data) {
			queue.insertAtTail(new Node(data));
		}

		// DEQUEUE
		public int dequeue() {
			Node node = queue.deleteFromHead();

			if (node == null) {
				throw new RuntimeException("Queue is empty");
			}

			return node.getData();
		}

		// PEEK
		public int peek() {
			Node node = queue.getHead();

			if (node == null) {
				throw new RuntimeException("Queue is empty");
			}

			return node.getData();
		}

		public boolean isEmpty() {
			return queue.length() == 0;
		}

	}
}
