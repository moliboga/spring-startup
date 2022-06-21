package com.example.logic;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class Component1 implements ApplicationRunner {

    private static final Logger LOG
            = Logger.getLogger(Component1.class.getName());

    private final Component2 component2;
    @Autowired
    private ApplicationContext context;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println(context.getBean(Component2.class).getStrField());
    }

    public Component1(Component2 component2){
        this.component2 = component2;
        LOG.info("Get Component2 strField from " + Component1.class.getSimpleName() + " = "
                + this.component2.getStrField());
        LOG.info("Constructor from " + InitMethodExampleBean.class.getSimpleName());
    }
}
