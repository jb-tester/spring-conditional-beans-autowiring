package com.mytests.spring.springconditionalbeansautowiring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringConditionalBeansAutowiringApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringConditionalBeansAutowiringApplication.class, args);
    }
    @Bean
        public CommandLineRunner commandLineRunner(UseConditionalBeans useConditionalBeans) {
            return args -> {
                System.out.println("--------------------------------------");
                useConditionalBeans.printBeans();
                System.out.println("--------------------------------------");
            };
        }
}
