package com.hsuhau.easy.service;

import com.hsuhau.easy.EasyApplication;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes = EasyApplication.class)
@ExtendWith(SpringExtension.class)
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