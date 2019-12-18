package com.hsuhau.easy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class NumJewelsInStones {
    public static int numJewelsInStones(String J, String S) {
        List<String> SL = Arrays.asList(S.split(""));
        List<String> JL = Arrays.asList(J.split(""));
        return (int)SL.stream().filter(s -> JL.contains(s)).count();
    }

    public static void main(String[] args) {
        String a = "aA";
        String b = "aAAbbbb";
        numJewelsInStones(a, b);
    }
}
