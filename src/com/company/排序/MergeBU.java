package com.company.排序;

public class MergeBU extends Example {
    private static Comparable[] aux;//归并所需的辅助数组

    @Override
    public void sort(Comparable[] array) {
        //进行lgN次两两归并
        int N = array.length;
        aux = new Comparable[N];
        for (int sz = 1; sz < N; sz = sz + sz) {//sz子数组大小
            for (int lo = 0; lo < N - sz; lo += sz + sz) {//lo:子数组索引
                merge(array, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, N - 1));
            }
        }
    }

    public void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else a[k] = aux[i++];
        }
    }

    public static void main(String[] args) {
        MergeBU mergeBU = new MergeBU();
        mergeBU.doSort();
    }
}
