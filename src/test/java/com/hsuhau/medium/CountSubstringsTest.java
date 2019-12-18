package com.hsuhau.medium;

import org.junit.jupiter.api.Test;

class CountSubstringsTest {
    @Test
    void test() {
        CountSubstrings countSubstrings = new CountSubstrings();
        int result = countSubstrings.countSubstrings("abbbbbba");
        System.out.println(result);
    }
}
