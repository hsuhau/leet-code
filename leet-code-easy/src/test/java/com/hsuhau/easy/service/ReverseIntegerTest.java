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
public class ReverseIntegerTest {
    @Autowired
    private ReverseInteger reverseInteger;

    @Test
    public void reverse() {
        int result = reverseInteger.reverse(-2147483648);
        Assert.assertEquals(0, result);
    }
}