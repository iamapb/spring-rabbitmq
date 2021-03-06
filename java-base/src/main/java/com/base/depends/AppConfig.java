package com.base.depends;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.base.depends")
public class AppConfig {

    @Bean(initMethod = "initialize")
    @DependsOn("eventListener")
    public EventPublisherBean eventPublisherBean() {
        return new EventPublisherBean();
    }

    @Bean(name = "eventListener", initMethod = "initialize")
    public EventListenerBean eventListenerBean() {
        return new EventListenerBean();
    }

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
