package com.hsuhau.medium.service;

import com.hsuhau.MainApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MainApplication.class)
public class LengthOfLongestSubstringTest {
    @Autowired
    private LengthOfLongestSubstring lengthOfLongestSubstring;

    @Test
    public void testLengthOfLongestSubstring() throws Exception {
        int result = lengthOfLongestSubstring.lengthOfLongestSubstring("abcabcbb");
        Assert.assertEquals(3, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme