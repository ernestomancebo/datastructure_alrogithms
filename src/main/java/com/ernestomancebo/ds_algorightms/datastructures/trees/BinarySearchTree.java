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

    @Override
    public void delete(T data) {
        TreeNode<T> current = root;
        TreeNode<T> parent = root;
        boolean isLeftchild = false;

        while (current != null && data.compareTo(current.getData()) != 0) {
            parent = current;

            if (data.compareTo(current.getData()) < 0) {
                current = current.getLeftChild();
                isLeftchild = true;
            } else {
                current = current.getRightChild();
                isLeftchild = false;
            }
        }

        // Wasn't found or tree is empty
        if (current == null) {
            return;
        }

        // If the node is a leaf
        if (current.isLeaf()) {
            if (current == root) {
                root = null;
            } else {
                if (isLeftchild) {
                    parent.setLeftChild(null);
                    ;
                } else {
                    parent.setRightChild(null);
                }
            }

        } else if (current.getLeftChild() == null) {
            // If the node has a right child
            if (current == root) {
                root = current.getRightChild();
            } else if (isLeftchild) {
                parent.setLeftChild(current.getRightChild());
            } else {
                parent.setRightChild(current.getRightChild());
            }
        } else if (current.getRightChild() == null) {
            // If the node has a left child
            if (current == root) {
                root = current.getLeftChild();
            } else if (isLeftchild) {
                parent.setLeftChild(current.getLeftChild());
            } else {
                parent.setLeftChild(current.getLeftChild());
            }
        } else {
            // If the node is a parent, seek the left most child
            TreeNode<T> successor = current;
            while (successor.getLeftChild() != null) {
                successor = successor.getLeftChild();
            }

            successor.setLeftChild(current.getLeftChild());
            successor.setRightChild(current.getRightChild());

            if (current == root) {
                root = successor;
            } else if (isLeftchild) {
                parent.setLeftChild(successor);
            } else {
                parent.setRightChild(successor);
            }
        }
    }

    public TreeNode<T> getMax() {
        if (!isTreeEmpty()) {
            return root.getMax();
        }

        return null;
    }

    public TreeNode<T> getMin() {
        if (!isTreeEmpty()) {
            return root.getMin();
        }

        return null;
    }

    public int countLeafs() {

        if (root != null) {
            return root.countLeafs();
        }

        return 0;
    }

    public int getHeight() {
        if (!isTreeEmpty()) {
            // One is added because at the last layer the leaf note is not
            // counted, but still a layer
            return (1 + root.getHeight());
        }

        return 0;
    }

    public boolean isTreeEmpty() {
        return root == null;
    }
}
