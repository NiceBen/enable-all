package com.zsl.enable;

import com.zsl.enable.annotation.EnableTConfiguration;
import com.zsl.enablet.config.EnableConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

//@ComponentScan("com.zsl")
//@Import(EnableConfiguration.class)
@EnableTConfiguration
@SpringBootApplication
public class EnableApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(EnableApplication.class, args);
        Object enableTest = context.getBean("enableTest");
        System.out.println(enableTest);
    }
}
