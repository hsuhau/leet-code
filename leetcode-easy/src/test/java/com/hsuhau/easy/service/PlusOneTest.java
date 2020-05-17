package com.hsuhau.easy.service;

import org.junit.Assert;
import org.junit.Test;

public class PlusOneTest {
    PlusOne plusOne = new PlusOne();

    @Test
    public void testPlusOne() throws Exception {
        int[] result = plusOne.plusOne(new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6});
        Assert.assertArrayEquals(new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 7}, result);
    }

    @Test
    public void testPlusOne0() throws Exception {
        int[] result = plusOne.plusOne0(new int[]{9, 9});
        Assert.assertArrayEquals(new int[]{1, 0, 0}, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme