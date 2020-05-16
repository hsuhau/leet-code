package com.hsuhau.easy.service;

import org.junit.Assert;
import org.junit.Test;

public class ReplaceSpaceTest {
    ReplaceSpace replaceSpace = new ReplaceSpace();

    @Test
    public void testReplaceSpace() throws Exception {
        String result = replaceSpace.replaceSpace("replace Me With Expected Result");
        Assert.assertEquals("replace%20Me%20With%20Expected%20Result", result);
    }

    @Test
    public void testReplaceSpace0() throws Exception {
        String result = replaceSpace.replaceSpace0("replace Me With Expected Result");
        Assert.assertEquals("replace%20Me%20With%20Expected%20Result", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme