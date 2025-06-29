package com.mytests.spring.springconditionalbeansautowiring;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "custom.config")
public class MyProps {
    boolean flag0;
    boolean flag1;
    boolean flag2;

    public boolean isFlag0() {
        return flag0;
    }

    public void setFlag0(boolean flag0) {
        this.flag0 = flag0;
    }

    public boolean isFlag1() {
        return flag1;
    }

    public void setFlag1(boolean flag1) {
        this.flag1 = flag1;
    }

    public boolean isFlag2() {
        return flag2;
    }

    public void setFlag2(boolean flag2) {
        this.flag2 = flag2;
    }
}
