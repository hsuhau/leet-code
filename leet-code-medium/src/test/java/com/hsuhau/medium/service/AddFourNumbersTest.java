package com.hsuhau.medium.service;

import com.hsuhau.medium.MediumApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes = MediumApplication.class)
@ExtendWith(SpringExtension.class)
public class AddFourNumbersTest {

    @Autowired
    private AddFourNumbers addFourNumbers;

    @Test
    public void fourSum() {
        addFourNumbers.fourSum(new int[]{-495, -477, -464, -424, -411, -409, -363, -337, -328, -328, -325, -320, -310, -285, -278, -235, -208, -151, -149, -147, -144, -132, -115, -107, -101, -98, -83, -58, -58, -56, -51, -46, -45, -7, 0, 4, 4, 21, 51, 52, 57, 60, 104, 109, 124, 141, 158, 205, 206, 241, 278, 278, 291, 314, 379, 416, 437, 447, 452, 496}, -1371);
    }
}