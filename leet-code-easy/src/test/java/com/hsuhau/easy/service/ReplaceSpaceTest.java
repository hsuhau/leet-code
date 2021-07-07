package com.hsuhau.easy.service;

import com.hsuhau.MainApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = MainApplication.class)
@RunWith(SpringRunner.class)
public class ReplaceSpaceTest {
    @Autowired
    private ReplaceSpace replaceSpace;

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