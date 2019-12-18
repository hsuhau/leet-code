package com.hsuhau.easy;

import java.util.Arrays;
import java.util.List;

public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        List<String> xList = Arrays.asList(concat(Integer.toBinaryString(x)).split(""));
        List<String> yList = Arrays.asList(concat(Integer.toBinaryString(y)).split(""));
        char[] yChar = concat(Integer.toBinaryString(y)).toCharArray();
        int num = 0;
        for (int i = 0; i < 32; i++) {
            if (!xList.get(i).equals(yList.get(i))) {
                num++;
            }
        }
        System.out.println(num);
        return num;
    }

    private static String concat(String o) {
        int len = o.length();
        while (len < 32) {
            o = "0".concat(o);
            len++;
        }
        return o;
    }

    public static void main(String[] args) { hammingDistance(90459594, 4353045);
    }
}
