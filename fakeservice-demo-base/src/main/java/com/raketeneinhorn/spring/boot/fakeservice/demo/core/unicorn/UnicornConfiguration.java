package com.raketeneinhorn.spring.boot.fakeservice.demo.core.unicorn;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UnicornConfiguration {

    @ConditionalOnMissingBean(UnicornService.class)
    @Bean
    UnicornService numbersService() {
        return new NiceUnicornService();
    }

}
