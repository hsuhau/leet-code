package com.hsuhau.easy.service;

import com.hsuhau.MainApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = MainApplication.class)
@RunWith(SpringRunner.class)
public class MaximumSubArrayTest {
    @Autowired
    private MaximumSubArray maximumSubarray;

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