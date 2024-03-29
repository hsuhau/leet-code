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
public class RemoveElementTest {
    @Autowired
    private RemoveElement removeElement;

    @Test
    public void testRemoveElement() throws Exception {
        int result = removeElement.removeElement(new int[]{0, 12, 3, 4, 3, 45, 55, 5, 5, 5, 5}, 5);
        Assert.assertEquals(7, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme