package com.mytests.spring.springconditionalbeansautowiring.conditionalComponents;

@org.springframework.stereotype.Service
class SecondConditionalOnBeanService implements ConditionalOnBeanService{

  @Override
    public String getId() {
        return "ConditionalOnBeanService_2";
    }
}