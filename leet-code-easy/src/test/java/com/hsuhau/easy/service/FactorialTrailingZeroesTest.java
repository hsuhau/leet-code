package com.hsuhau.easy.service;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTrailingZeroesTest {
    FactorialTrailingZeroes factorialTrailingZeroes = new FactorialTrailingZeroes();

    @Test
    public void testTrailingZeroes() throws Exception {
        int result = factorialTrailingZeroes.trailingZeroes(30);
        Assert.assertEquals(7, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme