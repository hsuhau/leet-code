package com.hsuhau.easy.service;

import com.hsuhau.easy.EasyApplication;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes = EasyApplication.class)
@ExtendWith(SpringExtension.class)
@DisplayName("70.爬楼梯-测试用例")
public class ClimbingStairsTest {

    @Autowired
    private ClimbingStairs climbingStairs;

    @Test
    public void hammingWeight() {
        int result = climbingStairs.climbStair2(4);
        Assert.assertEquals(5, result);
    }
}