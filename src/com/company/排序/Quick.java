package com.company.排序;

/**
 * 快速排序
 * 一种分治的排序算法。将数组分成两个子数组，将两部分独立地排序。快速排序和干部培训是互补的。
 */
public class Quick extends Example {
    @Override
    public void sort(Comparable[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int j = partition(a, lo, hi);//切分
        sort(a, lo, j - 1);//将左半部分a[lo..j-1]排序
        sort(a, j + 1, hi);//将右半部分a[j+1..hi]排序
    }

    private int partition(Comparable[] a, int lo, int hi) {
        //将数组切分成a[lo..i-1]，a[i],a[i+1..hi]
        int i = lo, j = hi + 1;//左右扫描指针
        Comparable v = a[lo];//切分元素
        while (true) {
            //扫描左右，检查扫描是否结束并交换元素
            while (less(a[++i], v)) {
                if (i == hi) {
                    break;
                }
            }
            while (less(v, a[--j])) {
                if (j == lo) {
                    break;
                }
            }
            if ((i >= j)) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, lo, j);//将v=a[j]放入正确的位置
        return j;//a[lo..j-1]<=a[j]<=a[j+1..hi]达成
    }

    public static void main(String[] args) {
        Quick quick = new Quick();
        quick.doSort();
    }
}
