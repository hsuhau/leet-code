package com.hsuhau.easy.service;

import com.hsuhau.easy.EasyApplication;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes = EasyApplication.class)
@ExtendWith(SpringExtension.class)
public class ReverseIntegerTest {
    @Autowired
    private ReverseInteger reverseInteger;

    @Test
    public void reverse() {
        int result = reverseInteger.reverse(-2147483648);
        Assert.assertEquals(0, result);
    }
}