package com.ernestomancebo.ds_algorightms.assigments;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StacksAndQueuesTest {
	StacksAndQueues stacksAndQueues = new StacksAndQueues();

	@Test
	public void testIsEmpty() {
		StacksAndQueues.Stack stack = stacksAndQueues.new Stack();
		assertTrue(stack.isEmpty());
	}

	@Test
	public void testPeek() {
		StacksAndQueues.Stack stack = stacksAndQueues.new Stack();
		stack.push(12);
		stack.push(25);

		assertEquals(25, stack.peek());
		stack.pop();
		assertEquals(12, stack.peek());
	}

	@Test(expected = RuntimeException.class)
	public void testPeekException() {
		StacksAndQueues.Stack stack = stacksAndQueues.new Stack();
		stack.peek();
	}

	@Test(expected = RuntimeException.class)
	public void testPopException() {
		StacksAndQueues.Stack stack = stacksAndQueues.new Stack();
		stack.pop();
	}

	@Test
	public void testPop() {
		StacksAndQueues.Stack stack = stacksAndQueues.new Stack();
		stack.push(12);
		stack.push(25);
		stack.push(45);

		assertEquals(45, stack.pop());
		assertEquals(25, stack.pop());
		assertEquals(12, stack.pop());
		assertTrue(stack.isEmpty());
	}

	@Test
	public void testFirstStackIsEmpty() {
		StacksAndQueues.DoubleStack doubleStack = stacksAndQueues.new DoubleStack();

		assertTrue(doubleStack.isFirstEmpty());
		assertTrue(doubleStack.isSecondEmpty());
	}

	@Test
	public void testPeekFirst() {
		StacksAndQueues.DoubleStack doubleStack = stacksAndQueues.new DoubleStack();
		doubleStack.pushFirst(22);
		doubleStack.pushFirst(15);
		doubleStack.pushFirst(6);

		assertEquals(6, doubleStack.peekFirst());
		assertEquals(6, doubleStack.peekFirst());
	}

	@Test
	public void testPopFirst() {
		StacksAndQueues.DoubleStack doubleStack = stacksAndQueues.new DoubleStack();
		doubleStack.pushFirst(22);
		doubleStack.pushFirst(15);
		doubleStack.pushFirst(6);

		assertEquals(6, doubleStack.popFirst());
		assertNotEquals(6, doubleStack.peekFirst());
		assertEquals(15, doubleStack.popFirst());
	}

	@Test
	public void testPeekSecond() {
		StacksAndQueues.DoubleStack doubleStack = stacksAndQueues.new DoubleStack();
		doubleStack.pushSecond(122);
		doubleStack.pushSecond(115);
		doubleStack.pushSecond(16);

		doubleStack.pushFirst(22);
		doubleStack.pushFirst(15);
		doubleStack.pushFirst(6);

		assertEquals(16, doubleStack.peekSecond());
		assertEquals(16, doubleStack.peekSecond());

		assertEquals(6, doubleStack.peekFirst());
		assertEquals(6, doubleStack.peekFirst());
	}

	@Test
	public void testPopSecond() {
		StacksAndQueues.DoubleStack doubleStack = stacksAndQueues.new DoubleStack();
		doubleStack.pushSecond(122);
		doubleStack.pushSecond(115);
		doubleStack.pushSecond(16);

		doubleStack.pushFirst(22);
		doubleStack.pushFirst(15);
		doubleStack.pushFirst(6);

		assertEquals(16, doubleStack.popSecond());
		assertNotEquals(16, doubleStack.peekSecond());
		assertEquals(115, doubleStack.popSecond());

		assertEquals(6, doubleStack.popFirst());
		assertNotEquals(6, doubleStack.peekFirst());
		assertEquals(15, doubleStack.popFirst());
	}

	@Test(expected = RuntimeException.class)
	public void testFirstReachStackLimit() {
		StacksAndQueues.DoubleStack doubleStack = stacksAndQueues.new DoubleStack();
		for (int i = 0; i < 200; i++) {
			doubleStack.pushFirst(i);
		}
	}

	@Test
	public void testQueueIsEmpty() {
		StacksAndQueues.LinkedQueue queue = stacksAndQueues.new LinkedQueue();
		assertTrue(queue.isEmpty());
	}

	@Test
	public void testPeekQueue() {
		StacksAndQueues.LinkedQueue queue = stacksAndQueues.new LinkedQueue();
		queue.enqueue(25);
		queue.enqueue(32);

		assertEquals(25, queue.peek());
		assertEquals(25, queue.peek());
		assertFalse(queue.isEmpty());
	}

	@Test
	public void testDequeue() {
		StacksAndQueues.LinkedQueue queue = stacksAndQueues.new LinkedQueue();
		queue.enqueue(25);
		queue.enqueue(32);

		assertEquals(25, queue.dequeue());
		assertEquals(32, queue.dequeue());
		assertTrue(queue.isEmpty());
	}

	@Test(expected = RuntimeException.class)
	public void testExceptionOnPeek() {
		StacksAndQueues.LinkedQueue queue = stacksAndQueues.new LinkedQueue();
		queue.peek();
	}

	@Test(expected = RuntimeException.class)
	public void testExceptionOnDequeue() {
		StacksAndQueues.LinkedQueue queue = stacksAndQueues.new LinkedQueue();
		queue.dequeue();
	}
}
