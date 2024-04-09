package com.hsuhau.medium.service;

import com.hsuhau.medium.MediumApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

/**
 * junit 5 test case
 */
@SpringBootTest(classes = MediumApplication.class)
@ExtendWith(SpringExtension.class)
@DisplayName("17.电话号码的字母组合-测试用例")
public class LetterCombinationsOfAPhoneNumberTest {
    @Autowired
    private LetterCombinationsOfAPhoneNumber letterCombinationsOfAPhoneNumber;

    @DisplayName("电话号码的字母组合")
    @ParameterizedTest
    @CsvSource({"2367,cfos"})
    public void testLetterCombinations(String digits, String excepted) {
        List<String> result = letterCombinationsOfAPhoneNumber.letterCombinations(digits);
        Assertions.assertEquals(excepted, result.get(result.size() - 1));
    }
}
