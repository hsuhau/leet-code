package com.hsuhau.easy.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class HammingDistance {
    public int hammingDistance(int x, int y) {
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

    private String concat(String o) {
        int len = o.length();
        while (len < 32) {
            o = "0".concat(o);
            len++;
        }
        return o;
    }

}
