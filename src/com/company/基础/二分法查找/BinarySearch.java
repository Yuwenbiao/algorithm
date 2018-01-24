package com.company.基础.二分法查找;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 二分法查找
 */
public class BinarySearch {
    private static int rank(int key, int[] a) {
//        int lo = 0;
//        int hi = a.length - 1;
//        while (lo < hi) {
//            int mid = lo + (hi - lo) / 2;
//            if (key < a[mid]) hi = mid - 1;
//            else if (key > a[mid]) lo = mid + 1;
//            else return mid;
//        }
//        return -1;
        return rank(key, a, 0, a.length - 1);
    }

    public static void main(String[] args) {
        int[] whitelist = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(whitelist);
        System.out.println(rank(3, whitelist));
    }

    /**
     * 递归方式
     */
    public static int rank(int key, int[] a, int lo, int hi) {
        //如果key存在于a[]中，它的索引不会小于lo且不会大于hi
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi);
        else return mid;
    }
}
