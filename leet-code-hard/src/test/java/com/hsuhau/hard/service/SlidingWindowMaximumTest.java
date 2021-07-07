package com.hsuhau.hard.service;

import com.hsuhau.MainApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = MainApplication.class)
@RunWith(SpringRunner.class)
class SlidingWindowMaximumTest {
    @Autowired
    private SlidingWindowMaximum slidingWindowMaximum;

    @Test
    void testMaxSlidingWindow() {
        int[] result = slidingWindowMaximum.maxSlidingWindow(new int[]{0}, 0);
        Assertions.assertArrayEquals(new int[]{0}, result);
    }

    @Test
    void testMaxSlidingWindow0() {
        int[] result = slidingWindowMaximum.maxSlidingWindow0(new int[]{0}, 0);
        Assertions.assertArrayEquals(new int[]{0}, result);
    }

    @Test
    void testCleanDeque() {
        slidingWindowMaximum.cleanDeque(0, 0);
    }

    @Test
    void testMaxSlidingWindow1() {
        int[] result = slidingWindowMaximum.maxSlidingWindow1(new int[]{0}, 0);
        Assertions.assertArrayEquals(new int[]{0}, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme