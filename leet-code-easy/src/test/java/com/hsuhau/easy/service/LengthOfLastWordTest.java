package com.hsuhau.easy.service;

import org.junit.Assert;
import org.junit.Test;

public class LengthOfLastWordTest {
    LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

    @Test
    public void testLengthOfLastWord() throws Exception {
        int result = lengthOfLastWord.lengthOfLastWord("");
        Assert.assertEquals(0, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme