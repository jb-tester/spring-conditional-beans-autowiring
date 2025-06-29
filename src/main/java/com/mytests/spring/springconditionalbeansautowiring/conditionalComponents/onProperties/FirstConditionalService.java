package com.mytests.spring.springconditionalbeansautowiring.conditionalComponents.onProperties;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(prefix = "custom.config", name = "flag1", havingValue = "true")
public class FirstConditionalService implements ConditionalService {

    @Override
    public String getId() {
        return "ConditionalService 1: flag1 = true";
    }
}


    