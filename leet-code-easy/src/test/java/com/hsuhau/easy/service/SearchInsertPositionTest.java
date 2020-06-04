package com.hsuhau.easy.service;

import org.junit.Assert;
import org.junit.Test;

public class SearchInsertPositionTest {
    SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

    @Test
    public void testSearchInsert() throws Exception {
        int result = searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 0);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSearchInsert0() throws Exception {
        int result = searchInsertPosition.searchInsert0(new int[]{1, 3, 5, 6}, 0);
        Assert.assertEquals(0, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme