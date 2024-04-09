package com.hsuhau.easy.service;

import com.hsuhau.easy.EasyApplication;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;

@SpringBootTest(classes = EasyApplication.class)
@ExtendWith(SpringExtension.class)
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