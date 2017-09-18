package com.ernestomancebo.ds_algorightms.datastructures.linkedlist;

import com.ernestomancebo.ds_algorightms.datastructures.linkedlist.node.HashNode;

public class HashLinkedList<k, v> {
    private HashNode<k, v> headNode;

    public HashLinkedList() {
    }

    public HashLinkedList(k key, v data) {
        headNode = new HashNode<k, v>(key, data);
    }

    public void insertAtHead(k key, v data) {
        HashNode<k, v> node = new HashNode<>(key, data);
        node.setNextNode(headNode);
        this.headNode = node;
    }

    public void deleteFromHead() {
        headNode = headNode.getNextNode();
    }

    public void deleteSpecificNode(k key) {
        HashNode<k, v> currentNode = headNode;
        HashNode<k, v> previousNode = null;

        while (currentNode != null) {
            if (currentNode.getKey().equals(key)) {
                // If is the head node
                if (previousNode == null) {
                    deleteFromHead();
                } else {
                    previousNode.setNextNode(currentNode.getNextNode());
                }
            }
            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        }

    }

    public int length() {
        int length = 0;
        HashNode<k, v> currentNode = headNode;

        while (currentNode != null) {
            length++;
            currentNode = currentNode.getNextNode();

        }

        return length;
    }

    public HashNode<k, v> search(k key) {
        HashNode<k, v> currentNode = headNode;
        while (currentNode != null) {
            if (currentNode.getKey().equals(key)) {
                return currentNode;
            }
            currentNode = currentNode.getNextNode();
        }

        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("{ ");
        HashNode<k, v> currentNode = headNode;

        while (currentNode != null) {
            stringBuilder.append("data: ");
            stringBuilder.append(currentNode.getData());
            stringBuilder.append(" - ");
            stringBuilder.append("key: ");
            stringBuilder.append(currentNode.getKey());
            
            currentNode = currentNode.getNextNode();

            if (currentNode != null) {
                stringBuilder.append(", ");
            }
        }

        stringBuilder.append(" }");

        return stringBuilder.toString();
    }

    public HashNode<k, v> getHeadNode() {
        return headNode;
    }
}
