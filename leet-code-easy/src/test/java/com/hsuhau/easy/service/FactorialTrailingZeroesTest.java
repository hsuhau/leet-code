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
public class FactorialTrailingZeroesTest {
    @Autowired
    private FactorialTrailingZeroes factorialTrailingZeroes;

    @Test
    public void testTrailingZeroes() throws Exception {
        int result = factorialTrailingZeroes.trailingZeroes(30);
        Assert.assertEquals(7, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme