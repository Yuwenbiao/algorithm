package com.company.排序;

/**
 * 希尔排序
 * 插入排序改进版，使数组中任意间隔为h的元素都是有序的。
 */
public class Shell extends Example {
    @Override
    public void sort(Comparable[] array) {
        //将a[]按升序排序
        int N = array.length;
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            //将数组变为h有序
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(array[j], array[j - h]); j -= h) {
                    exch(array, j, j - h);
                }
            }
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        Shell shell = new Shell();
        shell.doSort();
    }
}
