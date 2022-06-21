package com.example.logic;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@Component
@Scope(value = "prototype")
public class Component2 implements InitializingBean {

    private static final Logger LOG
            = Logger.getLogger(Component2.class.getName());

    private String strField;

    public Component2(){
        strField = "Hello from constructor";
        LOG.info("Constructor " + Component2.class.getSimpleName());
    }

    @PostConstruct
    private void setStrFieldPostConstruct(){
        strField = "Hello from post constructor";
        LOG.info("Post constructor " + Component2.class.getSimpleName());
    }

    public String getStrField(){
        LOG.info("getter " + Component2.class.getSimpleName());
        return strField;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        strField = "Hello from afterPropertiesSet";
        LOG.info("afterPropertiesSet " + Component2.class.getSimpleName());
    }
}
