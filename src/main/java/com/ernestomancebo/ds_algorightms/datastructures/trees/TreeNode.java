package com.ernestomancebo.ds_algorightms.datastructures.trees;

public class TreeNode<T extends Comparable<T>> {

    private T data;
    private TreeNode<T> leftChild;
    private TreeNode<T> rightChild;

    public TreeNode(T data) {
        this.data = data;
    }

    public TreeNode<T> find(T data) {
        int result = this.data.compareTo(data);

        // if is this, then is found. Otherwise could be a child or in the worst
        // case, not in the tree
        if (result == 0) {
            return this;
        } else if (result < 0 && leftChild != null) {
            return leftChild.find(data);
        } else if (rightChild != null) {
            return rightChild.find(data);
        }

        return null;
    }

    public void insert(T data) {
        if (this.data == null) {
            this.data = data;
        }

        int comparission = this.data.compareTo(data);

        if (comparission < 0) {
            if (leftChild == null) {
                leftChild = new TreeNode<>(data);
            } else {
                leftChild.insert(data);
            }

        } else {
            if (rightChild == null) {
                rightChild = new TreeNode<>(data);
            } else {
                rightChild.insert(data);
            }
        }
    }

    public TreeNode<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode<T> leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode<T> rightChild) {
        this.rightChild = rightChild;
    }

    public T getData() {
        return data;
    }

}
