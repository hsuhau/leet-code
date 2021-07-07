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
public class RemoveDuplicatesFromSortedArrayTest {
    @Autowired
    private RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray;

    @Test
    public void testRemoveDuplicates() throws Exception {
        int result = removeDuplicatesFromSortedArray.removeDuplicates(new int[]{0, 2, 3, 4, 4, 3, 22, 33, 33, 1, 1, 1, 1, 0});
        Assert.assertEquals(7, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme