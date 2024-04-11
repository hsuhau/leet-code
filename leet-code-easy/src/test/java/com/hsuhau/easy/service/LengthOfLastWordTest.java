package com.hsuhau.easy.service;

import com.hsuhau.easy.EasyApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes = EasyApplication.class)
@ExtendWith(SpringExtension.class)
public class LengthOfLastWordTest {
    @Autowired
    private LengthOfLastWord lengthOfLastWord;

    @ParameterizedTest
    @CsvSource({"'', 0"})
    public void testLengthOfLastWord(String s, int expected) throws Exception {
        int result = lengthOfLastWord.lengthOfLastWord(s);
        Assertions.assertEquals(expected, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme