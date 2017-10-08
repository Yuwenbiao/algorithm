package com.company.排序;

import java.util.Scanner;

abstract public class Example {
    abstract public void sort(Comparable[] array);

    protected boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    protected void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    protected void show(Comparable[] array) {
        //在单行打印数组
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public boolean isSorted(Comparable[] array) {
        //测试数组元素是否有序
        for (int i = 1; i < array.length; i++) {
            if (less(array[i], array[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public void doSort() {
        String[] array = {"E", "c", "A", "J", "k", "a"};
        sort(array);
        assert isSorted(array);
        show(array);
    }
}
