package com.company.排序;

public class Insertion extends Example {
    @Override
    public void sort(Comparable[] array) {
        //将a[]按升序排序
        int N = array.length;
        for (int i = 1; i < N; i++) {
            //将a[i]插入到a[i-1]、a[i-2]、a[i-3]...之中
            for (int j = i; j > 0 && less(array[j], array[j - 1]); j--) {
                exch(array, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {
        Insertion insertion = new Insertion();
        insertion.doSort();
    }
}
