package com.ernestomancebo.ds_algorightms.datastructures.trees;

import java.util.Arrays;

public class TreeNode<T extends Comparable<T>> {

    private T data;
    private TreeNode<T> leftChild;
    private TreeNode<T> rightChild;

    public TreeNode(T data) {
        this.data = data;
    }

    public TreeNode(T[] arrayOfData) {
        Arrays.sort(arrayOfData);
        initializeBalancedTree(arrayOfData);
    }

    private void initializeBalancedTree(T[] arrayOfData) {
        int middleIndex = Math.round(arrayOfData.length / 2);
        insert(arrayOfData[middleIndex]);

        if (middleIndex == 0) {
            return;
        }

        initializeBalancedTree(Arrays.copyOfRange(arrayOfData, 0, middleIndex));
        initializeBalancedTree(Arrays.copyOfRange(arrayOfData, middleIndex + 1, arrayOfData.length));

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

    public TreeNode<T> getMax() {
        if (this.getRightChild() == null) {
            return this;
        }

        return this.getRightChild().getMax();
    }

    public TreeNode<T> getMin() {
        if (this.getLeftChild() == null) {
            return this;
        }

        return this.getLeftChild().getMin();
    }

    public boolean isLeaf() {
        return (leftChild == null && rightChild == null);
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

    public int countLeafs() {
        int countRight = 0;
        int countLeft = 0;

        if (isLeaf()) {
            return 1;
        }

        if (rightChild != null) {
            countRight = rightChild.countLeafs();
        }

        if (leftChild != null) {
            countLeft = leftChild.countLeafs();
        }

        return countRight + countLeft;
    }

    public int getHeight() {
        int height = 1;

        if (isLeaf()) {
            return height;
        } else {
            int rightHeight = 0;
            int leftHeight = 0;

            if (rightChild != null) {
                rightHeight = rightChild.getHeight();
            }

            if (leftChild != null) {
                leftHeight = leftChild.getHeight();
            }

            if (leftHeight > rightHeight) {
                height += leftHeight;
            } else if (rightHeight > leftHeight) {
                height += rightHeight;
            } else {
                // If they are the same height, it doesn't matter which is added
                // at all
                height += leftHeight;
            }
            return height;
        }
    }

}
