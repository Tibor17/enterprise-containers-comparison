package com.example.demo.rest;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CdiBean {
    public String getStr() {
        return "hello from cdi";
    }
}
