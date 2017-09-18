package com.ernestomancebo.ds_algorightms.datastructures.hashtable;

import com.ernestomancebo.ds_algorightms.datastructures.linkedlist.HashLinkedList;
import com.ernestomancebo.ds_algorightms.datastructures.linkedlist.node.HashNode;

/**
 * Implementation of a hash table. Supports {@link String} as key so far.
 * 
 * @author
 *
 * @param <k>
 * @param <v>
 */
public class HashTable<k, v> {

    // HASH TABLES 101 :D
    private final int HASH_MAX = 101;
    private HashLinkedList<k, v>[] hashArray;

    public HashTable() {
        hashArray = new HashLinkedList[HASH_MAX];
    }

    // GET
    public v get(k key) {
        v returnValue = null;
        int positionInArray = hash(key);
        HashNode<k, v> nodeInPosition = hashArray[positionInArray].search(key);

        if (nodeInPosition != null) {
            returnValue = nodeInPosition.getData();
        }

        return returnValue;
    }

    // PUT
    public void put(k key, v data) {
        int positionInArray = hash(key);

        if (containsKey(key)) {
            HashNode<k, v> node = hashArray[positionInArray].search(key);
            node.setData(data);
        } else if (hashArray[positionInArray] == null) {
            hashArray[positionInArray] = new HashLinkedList<>();
        }

        hashArray[positionInArray].insertAtHead(key, data);
    }

    public void delete(k key) {
        int positionInArray = hash(key);

        if (hashArray[positionInArray] == null) {
            return;
        }

        hashArray[positionInArray].deleteSpecificNode(key);
    }

    // CONTAINS KEY
    public boolean containsKey(k key) {
        int positionInArray = hash(key);

        if (hashArray[positionInArray] == null) {
            return false;
        }

        HashNode<k, v> nodeInPosition = hashArray[positionInArray].search(key);
        return nodeInPosition != null;
    }

    private int hash(k key) {
        int position = -1;
        if (key instanceof String) {
            position = hash((String) key);
        }

        return position;
    }

    private int hash(String str) {
        return hash(str.toCharArray());
    }

    /**
     * Extracted from the youtube channel
     * <a href='https://www.youtube.com/user/cs50tv'>CS50</a>
     */
    private int hash(char[] str) {
        int sum = 0;

        for (int i = 0; i < str.length; i++) {
            sum += str[i];
        }

        return sum % HASH_MAX;
    }
}
