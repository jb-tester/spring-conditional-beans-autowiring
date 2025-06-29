package com.mytests.spring.springconditionalbeansautowiring.conditionalBeans;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
class ConditionalBeansConfig {

    @ConditionalOnProperty(prefix = "custom.config", name = "flag2", havingValue = "true")
    @Bean(name = "bean2")
    public Bean2 bean21() {
        return new Bean2("Conditional bean 1: flag2 = true");
    }
    @ConditionalOnProperty(prefix = "custom.config", name = "flag2", havingValue = "false")
    @Bean(name = "bean2")
    public Bean2 bean22() {
        return new Bean2("Conditional bean 2: flag2 = false");
    }
}
