package com.ernestomancebo.ds_algorightms.datastructures.trees;

public class BinaryTree<T extends Comparable<T>> {

    private TreeNode<T> root;

    public BinaryTree() {

    }

    public BinaryTree(T data) {
        if (data != null) {
            root = new TreeNode<T>(data);
        }
    }

    public void insert(T data) {
        if (root == null) {
            root = new TreeNode<T>(data);
            return;
        }

    }

    public TreeNode<T> find(T data) {
        return null;
    }

    public void delete(T data) {

    }

    public TreeNode<T> getRoot() {
        return root;
    }

}
