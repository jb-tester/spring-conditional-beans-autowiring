package com.mytests.spring.springconditionalbeansautowiring;

import com.mytests.spring.springconditionalbeansautowiring.conditionalBeans.Bean2;
import com.mytests.spring.springconditionalbeansautowiring.conditionalComponents.onBeans.ConditionalOnBeanService;
import com.mytests.spring.springconditionalbeansautowiring.conditionalComponents.onProperties.ConditionalService;
import com.mytests.spring.springconditionalbeansautowiring.conditionalConfigurations.Bean1;
import org.springframework.stereotype.Component;


@Component
class UseConditionalBeans {

    private final Bean1 bean1;
    private final Bean2 bean2;
    private final ConditionalService conditionalService;
    private final ConditionalOnBeanService conditionalOnBeanService;

    UseConditionalBeans(Bean1 bean1, Bean2 bean2, ConditionalService conditionalService, ConditionalOnBeanService conditionalOnBeanService) {
        this.bean2 = bean2;
        this.conditionalService = conditionalService;
        this.bean1 = bean1;
        this.conditionalOnBeanService = conditionalOnBeanService;
    }
    public void printBeans() {
        System.out.println(bean1.getS());
        System.out.println(conditionalService.getId());
        System.out.println(conditionalOnBeanService.getId());
        System.out.println(bean2.getS());
    }
}
