package com.mytests.spring.springconditionalbeansautowiring.conditionalComponents.onBeans;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnMissingBean(ConditionBean.class)
public class SecondConditionalOnBeanService implements ConditionalOnBeanService {

    @Override
    public String getId() {
        return "ConditionalOnBeanService 2: ConditionBean is missing";
    }
}