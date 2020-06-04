package com.hsuhau.easy.service;

import com.alibaba.fastjson.JSONObject;
import org.junit.Assert;
import org.junit.Test;

public class MergeSortedArrayTest {
    MergeSortedArray mergeSortedArray = new MergeSortedArray();

    @Test
    public void testMerge() throws Exception {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        mergeSortedArray.merge(nums1, 3, nums2, 3);
        System.out.println(JSONObject.toJSON(nums1));
        Assert.assertEquals(nums1, new int[]{1, 2, 2, 3, 5, 6});
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme