package com.ernestomancebo.ds_algorightms.datastructures.trees;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> {

    @Override
    public TreeNode<T> find(T data) {
        if (getRoot() != null) {
            return getRoot().find(data);
        }

        return null;
    }

    @Override
    public void insert(T data) {
        if (getRoot() == null) {
            super.insert(data);
            return;
        }

        getRoot().find(data);

    }
}
