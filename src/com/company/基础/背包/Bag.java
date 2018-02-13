package com.company.基础.背包;

import java.util.Iterator;

/**
 * 背包
 */
public class Bag<Item> implements Iterable<Item> {
    private Node first;//链表的首结点

    private class Node {
        Item item;
        Node next;
    }

    /**
     * 和Stack的push方法完全相同
     */
    public void add(Item item) {
        Node oldFisrt = first;
        first = new Node();
        first.item = item;
        first.next = oldFisrt;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        public void remove() {

        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
