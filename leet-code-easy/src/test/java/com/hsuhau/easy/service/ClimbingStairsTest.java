package com.hsuhau.easy.service;

import com.hsuhau.easy.EasyApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes = EasyApplication.class)
@ExtendWith(SpringExtension.class)
@DisplayName("70.爬楼梯-测试用例")
public class ClimbingStairsTest {

    @Autowired
    private ClimbingStairs climbingStairs;

    @ParameterizedTest
    @CsvSource({"4, 5"})
    public void hammingWeight(int n, int expected) {
        int result = climbingStairs.climbStair2(n);
        Assertions.assertEquals(expected, result);
    }
}