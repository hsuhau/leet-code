package com.hsuhau.easy.service;

import org.junit.Assert;
import org.junit.Test;

public class ImplementStrStrTest {
    ImplementStrStr implementStrStr = new ImplementStrStr();

    @Test
    public void testStrStr() throws Exception {
        int result = implementStrStr.strStr("haystackneedle", "needle");
        Assert.assertEquals(8, result);
    }
    @Test
    public void testStrStr0() throws Exception {
        int result = implementStrStr.strStr0("haystackneedle", "needle");
        Assert.assertEquals(8, result);
    }
    @Test
    public void testStrStr1() throws Exception {
        int result = implementStrStr.strStr1("haystackneedle", "needle");
        Assert.assertEquals(8, result);
    }
    @Test
    public void testStrStr2() throws Exception {
        int result = implementStrStr.strStr2("haystackneedle", "needle");
        Assert.assertEquals(8, result);
    }

}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme