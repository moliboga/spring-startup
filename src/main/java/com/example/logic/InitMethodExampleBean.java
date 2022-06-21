package com.example.logic;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

public class InitMethodExampleBean {
    private static final Logger LOG = Logger.getLogger(InitMethodExampleBean.class.getName());

    private void init(){
        LOG.info("Init from " + InitMethodExampleBean.class.getSimpleName());
    }

    @PostConstruct
    public void postConstructor(){
        LOG.info("Post constructor from " + InitMethodExampleBean.class.getSimpleName());
    }

    public InitMethodExampleBean(){
        LOG.info("Constructor from " + InitMethodExampleBean.class.getSimpleName());
    }
}
