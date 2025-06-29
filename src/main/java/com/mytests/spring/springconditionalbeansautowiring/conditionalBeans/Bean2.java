package com.mytests.spring.springconditionalbeansautowiring.conditionalConfigurations;


public class Bean1 {
    public String getS() {
        return s;
    }

    private final String s;

    public Bean1(String s) {
        this.s = s;
    }
}
