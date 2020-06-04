package com.hsuhau.easy.service;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {

    @Test
    public void reverse() {
        ReverseInteger reverseInteger = new ReverseInteger();
        int result = reverseInteger.reverse(-2147483648);
        Assert.assertEquals(0, result);
    }
}