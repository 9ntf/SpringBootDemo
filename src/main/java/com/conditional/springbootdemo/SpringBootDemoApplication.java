package com.conditional.springbootdemo;

import com.conditional.springbootdemo.profile.DevProfile;
import com.conditional.springbootdemo.profile.ProductionProfile;
import com.conditional.springbootdemo.profile.SystemProfile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

    @Bean
    @ConditionalOnProperty(prefix = "springbootdemo", name = "profile", havingValue = "dev")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(prefix = "springbootdemo", name = "profile", havingValue = "prod")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }

}
