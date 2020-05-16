package com.hsuhau.easy.service;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {
    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    public void testLongestCommonPrefix0() throws Exception {
        String result = longestCommonPrefix.longestCommonPrefix0(new String[]{"ca", "a"});
        Assert.assertEquals("", result);
    }

    @Test
    public void testLongestCommonPrefix1() throws Exception {
        String result = longestCommonPrefix.longestCommonPrefix1(new String[]{"ca", "a"});
        Assert.assertEquals("", result);
    }

    @Test
    public void testLongestCommonPrefix2() throws Exception {
        String result = longestCommonPrefix.longestCommonPrefix2(new String[]{"ca", "a"});
        Assert.assertEquals("", result);
    }

    @Test
    public void testLongestCommonPrefix4() throws Exception {
        String result = longestCommonPrefix.longestCommonPrefix4("a", new String[]{"ca", "a"});
        Assert.assertEquals("", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme