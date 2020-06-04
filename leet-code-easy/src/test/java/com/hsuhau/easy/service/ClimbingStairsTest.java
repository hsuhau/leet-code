package com.hsuhau.easy.service;

import org.junit.Assert;
import org.junit.Test;

public class ClimbingStairsTest {
    ClimbingStairs climbingStairs = new ClimbingStairs();

    @Test
    public void testClimbStairs() throws Exception {
        int result = climbingStairs.climbStairs(0);
        Assert.assertEquals(0, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme