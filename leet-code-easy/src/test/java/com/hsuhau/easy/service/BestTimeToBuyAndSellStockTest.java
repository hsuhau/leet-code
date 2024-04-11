package com.hsuhau.easy.service;

import com.hsuhau.easy.EasyApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.stream.Stream;

@SpringBootTest(classes = EasyApplication.class)
@ExtendWith(SpringExtension.class)
public class BestTimeToBuyAndSellStockTest {
    @Autowired
    private BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock;

    // 数据源方法，返回测试参数
    static Stream<Arguments> maxProfitData() {
        return Stream.of(
                Arguments.of(new int[]{4, 2, 3, 5, 2, 5}, 3),
                Arguments.of(new int[]{7, 1, 5, 3, 6, 4}, 5),
                Arguments.of(new int[]{7, 6, 4, 3, 1}, 0),
                Arguments.of(new int[]{1, 2}, 1)
                // 您可以根据需要添加更多的测试数据
        );
    }

    @ParameterizedTest
    @MethodSource("maxProfitData")
    public void testMaxProfit(int[] prices, int expected) throws Exception {
        int result = bestTimeToBuyAndSellStock.maxProfit(prices);
        Assertions.assertEquals(expected, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme