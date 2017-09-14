package com.ernestomancebo.ds_algorightms.assigments;

public class Recursion {

	/*
	 * Write an add method, which takes two positive integers and returns their
	 * sum. Of course, for this problem, you need to use recursion. Think about
	 * what would be the base case (when a number becomes 0?).
	 */
	public int recursiveSum(int a, int b) {
		if (b == 0) {
			return a;
		}

		return recursiveSum(a + 1, b - 1);
	}

	/*
	 * Write a recursive method to calculate the sum of squares of the first n
	 * natural numbers. n is to be given as an input.
	 */
	public int sumOfSquare(int n) {
		if (n == 1) {
			return 1;
		}

		return (n * n) + sumOfSquare(n - 1);
	}
}
