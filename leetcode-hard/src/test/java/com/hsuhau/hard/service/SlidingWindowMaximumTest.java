package com.hsuhau.hard.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayDeque;

import static org.mockito.Mockito.*;

class SlidingWindowMaximumTest {
    @Mock
    ArrayDeque<Integer> deque;
    //Field nums of type int[] - was not mocked since Mockito doesn't mock arrays
    @InjectMocks
    SlidingWindowMaximum slidingWindowMaximum;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

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