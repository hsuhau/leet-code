package com.hsuhau.medium.service;

import com.hsuhau.MainApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest(classes = MainApplication.class)
@RunWith(SpringRunner.class)
public class AddThreeNumbersTest {
    @Autowired
    private AddThreeNumbers addThreeNumbers;

    @Test
    public void threeSum() {
        List<List<Integer>> result = addThreeNumbers.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println("result = " + result);
    }
}