package com.mytests.spring.springconditionalbeansautowiring.conditionalConfigurations;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConditionalOnProperty(prefix = "custom.config", name = "flag0", havingValue = "false")
class ConditionalConfiguration2 {
    @Bean
    public Bean1 bean1() {
        return new Bean1("conditional configuration 1: flag0 = false");
    }
}
