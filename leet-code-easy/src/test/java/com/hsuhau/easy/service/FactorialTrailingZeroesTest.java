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