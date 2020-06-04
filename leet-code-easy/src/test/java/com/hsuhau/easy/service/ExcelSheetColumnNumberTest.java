package com.hsuhau.easy.service;

import org.junit.Assert;
import org.junit.Test;

public class ExcelSheetColumnNumberTest {
    ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();

    @Test
    public void testTitleToNumber() throws Exception {
        int result = excelSheetColumnNumber.titleToNumber("SA");
        Assert.assertEquals(495, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme