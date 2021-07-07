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
public class BestTimeToBuyAndSellStockTest {
    @Autowired
    private BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock;

    @Test
    public void testMaxProfit() throws Exception {
        int result = bestTimeToBuyAndSellStock.maxProfit(new int[]{4,2,3,5,2,5});
        Assert.assertEquals(3, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme