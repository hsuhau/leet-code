package com.hsuhau.easy.service;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {
    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    public void testLongestCommonPrefix() throws Exception {
        String result = longestCommonPrefix.longestCommonPrefix(new String[]{"ca","a"});
        Assert.assertEquals("", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme