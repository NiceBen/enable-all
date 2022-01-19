package com.zsl.enablet.config;

import com.zsl.enablet.model.EnableTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnableConfiguration {

    @Bean
    public EnableTest enableTest() {
        return new EnableTest();
    }
}
