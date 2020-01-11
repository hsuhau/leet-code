package com.hsuhau.easy.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service
public class NumJewelsInStones {
    public int numJewelsInStones(String J, String S) {
        List<String> SL = Arrays.asList(S.split(""));
        List<String> JL = Arrays.asList(J.split(""));
        return (int)SL.stream().filter(s -> JL.contains(s)).count();
    }
}
