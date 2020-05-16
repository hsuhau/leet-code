package com.hsuhau.easy.service;

import org.junit.Assert;
import org.junit.Test;

public class RemoveElementTest {
    RemoveElement removeElement = new RemoveElement();

    @Test
    public void testRemoveElement() throws Exception {
        int result = removeElement.removeElement(new int[]{0, 12, 3, 4, 3, 45, 55, 5, 5, 5, 5}, 5);
        Assert.assertEquals(7, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme