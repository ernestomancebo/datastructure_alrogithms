package com.ernestomancebo.ds_algorightms.datastructures.hashtable;

import com.ernestomancebo.ds_algorightms.datastructures.linkedlist.HashLinkedList;

public class HashTable<k, v> {

    // HASH TABLES 101 :D
    final int HASH_MAX = 101;
    final HashLinkedList<k, v>[] hashArray;

    public HashTable() {
        hashArray = new HashLinkedList[HASH_MAX];
    }

    // GET
    // PUT
    // CONTAINS KEY
    // IS SLOT EMPTY

    /**
     * Extracted from the youtube channel
     * <a href='https://www.youtube.com/user/cs50tv'>CS50</a>
     */
    public int hash(char[] str) {
        int sum = 0;

        for (int i = 0; str[i] != '\0'; i++) {
            sum += str[i];
        }

        return sum % HASH_MAX;
    }
}
