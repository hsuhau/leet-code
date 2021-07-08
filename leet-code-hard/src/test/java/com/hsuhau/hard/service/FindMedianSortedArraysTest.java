package com.hsuhau.hard.service;

import com.hsuhau.MainApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = MainApplication.class)
@RunWith(SpringRunner.class)
public class FindMedianSortedArraysTest {
    @Autowired
    private FindMedianSortedArrays findMedianSortedArrays;

    @Test
    public void testFindMedianSortedArrays() throws Exception {
        double result = findMedianSortedArrays.findMedianSortedArrays(new int[]{0, 2, 4}, new int[]{0, 2, 3, 5});
        Assert.assertEquals(2, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme