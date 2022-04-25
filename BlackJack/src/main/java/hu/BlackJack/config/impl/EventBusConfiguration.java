package hu.BlackJack.config.impl;

import org.greenrobot.eventbus.EventBus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventBusConfiguration {
    @Bean
    EventBus eventBus(){
        return new EventBus();
    }
}
