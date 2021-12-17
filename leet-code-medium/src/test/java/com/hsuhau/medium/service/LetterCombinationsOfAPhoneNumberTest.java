package com.hsuhau.medium.service;

import java.util.List;

import com.hsuhau.MainApplication;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = MainApplication.class)
@RunWith(SpringRunner.class)
public class LetterCombinationsOfAPhoneNumberTest {
    @Autowired
    private LetterCombinationsOfAPhoneNumber letterCombinationsOfAPhoneNumber;

    @Test
    public void testLetterCombinations() {
        String digits = "2367";
        List<String> result = letterCombinationsOfAPhoneNumber.letterCombinations(digits);
        Assert.assertEquals(result.get(result.size() - 1), "cfos");
    }
}
