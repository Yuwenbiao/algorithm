package com.company.基础.求最大公约数;

/**
 * 求最大公约数
 */
public class Gcd {
    public static void main(String[] args) {
        System.out.println(gcd(4, 2));
    }

    public static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }
}
