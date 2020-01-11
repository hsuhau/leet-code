package com.hsuhau.easy.service;

import org.springframework.stereotype.Service;

@Service
public class DefangIPAddr {
    // todo

    public String defangIPAddr(String address) {
        return address.replace(".", "[.]");
    }
}
