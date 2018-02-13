package com.company.基础.堆栈;

import java.util.Iterator;

/**
 * 下压堆栈（链表实现）
 */
public class Stack<Item> implements Iterable<Item> {
    private Node first;//栈顶
    private int N;//元素数量

    /**
     * 结点类
     */
    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    /**
     * 向栈顶添加元素
     */
    public void push(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

    /**
     * 从栈顶删除元素
     */
    public Item pop() {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }
}
