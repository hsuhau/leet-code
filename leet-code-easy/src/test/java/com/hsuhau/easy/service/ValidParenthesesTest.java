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
public class ValidParenthesesTest {
    @Autowired
    ValidParentheses validParentheses;

    @Test
    public void testIsValid() throws Exception {
        boolean result = validParentheses.isValid("]");
        Assert.assertEquals(false, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme