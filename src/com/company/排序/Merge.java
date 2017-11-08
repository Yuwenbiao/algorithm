package com.company.排序;

/**
 * 归并排序
 * 将一个数组排序，可以（递归地）将它分成两半分别排序，然后将结果归并起来
 */
public class Merge extends Example {
    private static Comparable[] aux;//归并所需的辅助数组

    public void sort(Comparable[] a) {
        aux = new Comparable[a.length];//一次性分配空间
        sort(a, 0, a.length - 1);
    }

    private void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);//将左半边排序
        sort(a, mid + 1, hi);//将右半边排序
        merge(a, lo, mid, hi);//归并结果
    }

    public void merge(Comparable[] a, int lo, int mid, int hi) {
        //将a[lo..mid]和a[mid+1..hi]归并
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {//将a[lo..hi]复制到aux[lo..hi]
            aux[k] = a[k];
        }
        for (int k = lo; k <= hi; k++) {//归并回到a[lo..hi]
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
        Merge merge = new Merge();
        merge.doSort();
    }
}
