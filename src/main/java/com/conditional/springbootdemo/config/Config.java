package com.conditional.springbootdemo.config;

import com.conditional.springbootdemo.profile.DevProfile;
import com.conditional.springbootdemo.profile.ProductionProfile;
import com.conditional.springbootdemo.profile.SystemProfile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    @ConditionalOnProperty(prefix = "springbootdemo", name = "profile", havingValue = "true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(prefix = "springbootdemo", name = "profile", havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
