package com.ernestomancebo.ds_algorightms.datastructures.linkedlist;

public class HashNode<k, v> {

    private k key;
    private v data;
    private HashNode<k, v> nextNode;

    public HashNode(k key, v data) {
        this.key = key;
        this.data = data;
    }

    public k getKey() {
        return key;
    }

    public void setKey(k key) {
        this.key = key;
    }

    public v getData() {
        return data;
    }

    public void setData(v data) {
        this.data = data;
    }

    public HashNode<k, v> getNextNode() {
        return nextNode;
    }

    public void setNextNode(HashNode<k, v> nextNode) {
        this.nextNode = nextNode;
    }

}
