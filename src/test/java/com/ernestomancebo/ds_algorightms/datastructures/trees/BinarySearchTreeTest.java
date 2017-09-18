package com.ernestomancebo.ds_algorightms.datastructures.trees;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTreeTest {

    @Test
    public void countLefsTest() {
        TreeNode<Integer> treeNode = getBasicTreeNode();
        assertEquals(7, treeNode.countLeafs());
    }

    @Test
    public void getTeeHeightTest() {
        TreeNode<Integer> treeNode = new TreeNode<Integer>(0);
        // There's only the root
        assertEquals(1, treeNode.getHeight());

        treeNode = getBasicTreeNode();
        assertEquals(5, treeNode.getHeight());

        // Trust yourself tigre and another layer
        treeNode.insert(69);
        assertEquals(6, treeNode.getHeight());
    }

    /**
     * Given a sorted array in increasing order of elements, write an algorithm
     * to create a binary search tree with least height. Before implementing,
     * think about the strategy you will adopt.
     * 
     * <p>
     * 
     * That said, using the same array of previous tests the height of the tree
     * must be less than 5
     */
    @Test
    public void treeWithSortedElementsTest() {
        Integer[] treeInput = { 52, 33, 65, 25, 39, 60, 78, 12, 27, 34, 48, 72, 90, 70 };
        TreeNode<Integer> treeWithSortedInput = new TreeNode<>(treeInput);

        assertEquals(3, treeWithSortedInput.getHeight());
    }

    private TreeNode<Integer> getBasicTreeNode() {
        int[] treeInput = { 52, 33, 65, 25, 39, 60, 78, 12, 27, 34, 48, 72, 90, 70 };
        TreeNode<Integer> basicTreeNode = new TreeNode<>(treeInput[0]);

        for (int i = 1; i < treeInput.length; i++) {
            basicTreeNode.insert(treeInput[i]);
        }

        return basicTreeNode;
    }
}
