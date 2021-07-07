package com.hsuhau.easy.service;

import com.hsuhau.MainApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@SpringBootTest(classes = MainApplication.class)
@RunWith(SpringRunner.class)
public class CountBitsTest {

    @Autowired
    private CountBits countBits;

    @Test
    public void countBits() {
        int[] result = countBits.countBits(2);
        int[] test = {0, 1, 1};
        System.out.println("Arrays.toString(ans) = " + Arrays.toString(result));
        Assert.assertArrayEquals(test, result);
    }
}