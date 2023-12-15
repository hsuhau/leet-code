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
public class PermuteUniqueTest {
    @Autowired
    private PermuteUnique permuteUnique;

    @Test
    public void permuteUnique() {
        int[] array = new int[]{1, 2, 3, 3, 4, 2};
        List<List<Integer>> result = permuteUnique.permuteUnique(array);
    }

    @Test
    public void backtrack() {
    }
}