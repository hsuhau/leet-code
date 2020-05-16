package com.hsuhau.easy.service;

import org.springframework.stereotype.Service;

@Service
public class ReverseInteger {

    public int reverse(int x) {
        Long xLong = new Long(x);
        long absX = Math.abs(xLong);
        if (xLong < 0 && -xLong != (int) (-xLong)) {
            return 0;
        }
        int len = 0;
        while (absX >= Math.pow(10, len + 1)) {
            len++;
        }
        long result = 0;
        for (int i = 0; i <= len; i++) {
            long mod = (long) Math.pow(10, len - i);
            long tmp = absX / mod;
            absX -= tmp * mod;
            result += tmp * (long) Math.pow(10, i);
            if (result != (int) result) {
                return 0;
            }
        }
        return x > 0 ? (int) result : -(int) result;
    }
}
