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
public class ImplementStrStrTest {
    @Autowired
    private ImplementStrStr implementStrStr;

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