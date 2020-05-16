package com.hsuhau.easy.service;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {
    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    public void testLongestCommonPrefix() throws Exception {
        String result = longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight","f"});
        Assert.assertEquals("f", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme