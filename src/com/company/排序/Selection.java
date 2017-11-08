package com.company.排序;

/**
 * 快速排序
 * 找到数组中最小的那个元素，然后将它和数组的第一个元素交换元素。在剩下的元素中重复此操作。
 */
public class Selection extends Example {
    @Override
    public void sort(Comparable[] array) {
        //将a[]按升序排列
        int N = array.length;
        for (int i = 0; i < N; i++) {
            //将a[i]和[i+1..N]中最小的元素交换
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(array[j], array[min])) {
                    min = j;
                }
            }
            exch(array, i, min);
        }
    }

    public static void main(String[] args) {
        Selection selection = new Selection();
        selection.doSort();
    }
}
