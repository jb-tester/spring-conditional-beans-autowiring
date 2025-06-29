package com.mytests.spring.springconditionalbeansautowiring.conditionalBeans;


public class Bean2 {
    public String getS() {
        return s;
    }

    private final String s;

    public Bean2(String s) {
        this.s = s;
    }
}
