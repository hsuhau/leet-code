package com.hsuhau.medium.service;

import com.hsuhau.medium.MediumApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@SpringBootTest(classes = MediumApplication.class)
@ExtendWith(SpringExtension.class)
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