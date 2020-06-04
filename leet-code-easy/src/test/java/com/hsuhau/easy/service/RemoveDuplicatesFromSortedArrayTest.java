package com.hsuhau.easy.service;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {
    RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

    @Test
    public void testRemoveDuplicates() throws Exception {
        int result = removeDuplicatesFromSortedArray.removeDuplicates(new int[]{0, 2, 3, 4, 4, 3, 22, 33, 33, 1, 1, 1, 1, 0});
        Assert.assertEquals(7, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme