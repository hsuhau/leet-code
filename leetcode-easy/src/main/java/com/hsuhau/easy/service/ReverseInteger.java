package com.hsuhau.easy.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ReverseInteger {

    //todo 解答错误
    public int reverse(int x) {
        int absX = Math.abs(x);
        int len = 0;
        while (absX >= Math.pow(10, len + 1)) {
            len++;
        }
        List<Integer> lsit = new ArrayList<>();
        long result = 0;
        for (int i = 0; i <= len; i++) {
            int mod = (int) Math.pow(10, len - i);
            int tmp = absX / mod;
            absX -= tmp * mod;
            result += tmp * (int) Math.pow(10, i);
        }
        return (result < -Math.pow(2, 31) || result > Math.pow(2, 31) - 1) ? 0 : x > 0 ? (int) result : -(int) result;
    }
}
