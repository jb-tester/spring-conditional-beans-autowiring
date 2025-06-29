package com.mytests.spring.springconditionalbeansautowiring.conditionalComponents;

@org.springframework.stereotype.Service
class FirstConditionalOnBeanService implements ConditionalOnBeanService{

  @Override
    public String getId() {
        return "ConditionalOnBeanService_1";
    }
}


    