package com.example.logic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Configuration
public class Config {
    private static final Logger LOG = Logger.getLogger(Config.class.getName());

    @Bean(initMethod="init")
    public InitMethodExampleBean initMethodExampleBean() {
        LOG.info("Bean creating from " + Config.class.getSimpleName());
        return new InitMethodExampleBean();
    }
}
