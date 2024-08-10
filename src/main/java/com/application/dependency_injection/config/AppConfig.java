package com.application.dependency_injection.config;

import com.application.dependency_injection.servises.ApplicationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.application")
public class AppConfig {

    @Bean
    public ApplicationService applicationService() {
        return new ApplicationService();
    }

}
