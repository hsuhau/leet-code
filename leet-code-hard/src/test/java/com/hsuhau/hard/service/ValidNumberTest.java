package com.hsuhau.hard.service;

import com.hsuhau.hard.HardApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * FIXME: 实现不对
 */
@SpringBootTest(classes = HardApplication.class)
@ExtendWith(SpringExtension.class)
@DisplayName("65.有效数字-测试用例")
@Slf4j
class ValidNumberTest {
    @Autowired
    private ValidNumber validNumber;

    @AfterAll
    static void done() {
        log.info("@AfterAll - executed after all test methods.");
    }

    @DisplayName("有效数字")
    @ParameterizedTest
    @ValueSource(strings = {"2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7", "+6e-1", "53.5e93", "-123.456e789"})
    void isNumberValid(String digits) {
        Assertions.assertTrue(validNumber.isNumber_wrong(digits));
    }

    @DisplayName("无效数字")
    @ParameterizedTest
    @ValueSource(strings = {"abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53"})
    void isNumberInvalid(String digits) {
        Assertions.assertTrue(!validNumber.isNumber_wrong(digits));
    }
}