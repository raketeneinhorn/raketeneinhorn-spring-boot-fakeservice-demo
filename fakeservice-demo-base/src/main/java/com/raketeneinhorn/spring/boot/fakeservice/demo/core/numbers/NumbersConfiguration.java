package com.raketeneinhorn.spring.boot.fakeservice.demo.core.numbers;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NumbersConfiguration {

    @ConditionalOnMissingBean(NumbersService.class)
    @Bean
    NumbersService numbersService() {
        return new EvenNumbersService();
    }

}
