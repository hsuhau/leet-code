package com.hsuhau.easy.service;

import org.junit.Assert;
import org.junit.Test;

public class MaximumSubArrayTest {
    MaximumSubArray maximumSubarray = new MaximumSubArray();

    @Test
    public void testMaxSubArray0() throws Exception {
        int result = maximumSubarray.maxSubArray0(new int[]{0});
        Assert.assertEquals(0, result);
    }

    @Test
    public void testMaxSubArray1() throws Exception {
        int result = maximumSubarray.maxSubArray1(new int[]{0});
        Assert.assertEquals(0, result);
    }


}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme