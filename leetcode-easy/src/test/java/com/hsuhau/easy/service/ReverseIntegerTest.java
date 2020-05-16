package com.hsuhau.easy.service;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {

    @Test
    public void reverse() {
        ReverseInteger reverseInteger = new ReverseInteger();
        int result = reverseInteger.reverse(1534236469);
        Assert.assertEquals(1056389759, result);
    }
}