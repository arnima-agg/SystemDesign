package com.example.LLD;

import java.util.HashMap;

public class HashMapImpl<K,V> {
    int MAX_CAPACITY = 16;
    int j;

    Node[] hashmap = new Node[MAX_CAPACITY];

    class Node<K,V> {
        K key;
        V value;
        Node next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;

        }
    }
    public void put(K key, V value) {
        int hashCode = key.hashCode() % hashmap.length;
        Node node = new Node(key, value);
        if(hashmap[hashCode] == null) {
            hashmap[hashCode] = node;
        } else {
            Node node1 = hashmap[hashCode];
            Node previousNode = null;
            while(node1 != null) {
                previousNode = node1;
                node1 = node1.next;
            }
            previousNode.next = node;
        }
    }

    public V get(K key) {
        int hashCode = key.hashCode() % hashmap.length;
        Node node = hashmap[hashCode];
        V result = null;
        while(node != null && !node.key.equals(key)) {
            result = (V)node.value;
            node = node.next;
        }
        return result;
    }

}
