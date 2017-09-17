package com.ernestomancebo.ds_algorightms.datastructures.hashtable;

import static org.junit.Assert.*;

import org.junit.Test;

public class HashTableTest {

    @Test
    public void testContainsKey() {
        HashTable<String, Integer> hashTable = new HashTable<>();

        hashTable.put("one", 1);
        hashTable.put("two", 2);
        hashTable.put("three", 3);

        assertTrue(hashTable.containsKey("one"));
        assertTrue(hashTable.containsKey("two"));
        assertTrue(hashTable.containsKey("three"));

        assertFalse(hashTable.containsKey("house"));
        assertFalse(hashTable.containsKey("mami"));
    }

    @Test
    public void testUpdateKey() {
        HashTable<String, Integer> hashTable = new HashTable<>();

        hashTable.put("one", 1);
        hashTable.put("two", 2);
        hashTable.put("three", 3);

        assertEquals(new Integer(1), hashTable.get("one"));

        hashTable.put("one", 125);
        assertEquals(new Integer(125), hashTable.get("one"));
    }

    @Test
    public void testDeleteKey() {
        HashTable<String, Integer> hashTable = new HashTable<>();

        hashTable.put("one", 1);
        hashTable.put("two", 2);
        hashTable.put("three", 3);

        assertEquals(new Integer(1), hashTable.get("one"));

        hashTable.delete("one");
        assertFalse(hashTable.containsKey("one"));
    }

}
