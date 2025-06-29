package com.mytests.spring.springconditionalbeansautowiring.conditionalComponents.onBeans;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnBean(ConditionBean.class)
public class FirstConditionalOnBeanService implements ConditionalOnBeanService {

    @Override
    public String getId() {
        return "ConditionalOnBeanService 1: ConditionBean is present";
    }
}


    