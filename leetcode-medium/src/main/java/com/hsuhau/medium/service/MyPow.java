package com.hsuhau.medium.service;

/**
 * 50. Pow(x, n)
 *
 *
 */
public class MyPow {
    public static double myPow(double x, int n) {
        double y = 1.0;
        if (x == 1) {
        } else if (n > 0) {
            for (int i = 0; i < n; i++) {
                y *= x;
            }
        } else if (n < 0) {

            for (int i = 0; i > n; i--) {
                y /= x;
            }
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println(myPow(1.00000, 2147483647));
    }
}
