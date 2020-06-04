package com.hsuhau.easy.service;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeToBuyAndSellStockTest {
    BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

    @Test
    public void testMaxProfit() throws Exception {
        int result = bestTimeToBuyAndSellStock.maxProfit(new int[]{4,2,3,5,2,5});
        Assert.assertEquals(3, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme