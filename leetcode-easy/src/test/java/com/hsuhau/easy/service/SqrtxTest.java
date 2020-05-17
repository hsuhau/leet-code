package com.hsuhau.easy.service;

import org.junit.Assert;
import org.junit.Test;

public class SqrtxTest {
    Sqrtx sqrtx = new Sqrtx();

    @Test
    public void testMySqrt() throws Exception {
        int result = sqrtx.mySqrt(4);
        Assert.assertEquals(2, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme