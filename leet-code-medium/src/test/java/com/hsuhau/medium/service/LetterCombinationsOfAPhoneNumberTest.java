package com.hsuhau.medium.service;

import com.hsuhau.MainApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

/**
 * junit 5 test case
 */
@SpringBootTest(classes = MainApplication.class)
@ExtendWith(SpringExtension.class)
@DisplayName("17.电话号码的字母组合-测试用例")
public class LetterCombinationsOfAPhoneNumberTest {
    @Autowired
    private LetterCombinationsOfAPhoneNumber letterCombinationsOfAPhoneNumber;

    @DisplayName("2367")
    @ParameterizedTest
    @ValueSource(strings = {"2367"})
    public void testLetterCombinations(String digits) {
        List<String> result = letterCombinationsOfAPhoneNumber.letterCombinations(digits);
        Assertions.assertEquals("cfos", result.get(result.size() - 1));
    }
}
