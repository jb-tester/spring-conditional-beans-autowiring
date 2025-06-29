package com.mytests.spring.springconditionalbeansautowiring.conditionalComponents.onProperties;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(prefix = "custom.config", name = "flag1", havingValue = "false")
public class SecondConditionalService implements ConditionalService {

    @Override
    public String getId() {
        return "ConditionalService 2: flag1 = false";
    }
}