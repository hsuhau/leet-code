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
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme