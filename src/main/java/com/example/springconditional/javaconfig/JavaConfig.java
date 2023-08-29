package com.example.springconditional.javaconfig;

import com.example.springconditional.profile.DevProfile;
import com.example.springconditional.profile.ProductionProfile;
import com.example.springconditional.profile.SystemProfile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @ConditionalOnProperty(value = "profile.dev", havingValue = "true")
    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @ConditionalOnProperty(value = "profile.dev", havingValue = "false")
    @Bean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
