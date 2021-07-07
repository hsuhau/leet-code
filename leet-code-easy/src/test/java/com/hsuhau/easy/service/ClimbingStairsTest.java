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
public class ClimbingStairsTest {

    @Autowired
    private ClimbingStairs climbingStairs;

    @Test
    public void hammingWeight() {
        int result = climbingStairs.hammingWeight(3);
        Assert.assertEquals(3, result);
    }
}