package com.application.dependency_injection.config;

import com.application.dependency_injection.domain.DepartmentRepository;
import com.application.dependency_injection.domain.DepartmentRepositoryImpl;
import com.application.dependency_injection.domain.EmployeeRepository;
import com.application.dependency_injection.domain.EmployeeRepositoryImpl;
import com.application.dependency_injection.servises.ApplicationService;
import com.application.dependency_injection.servises.ApplicationServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.application")
public class AppConfig {

    @Bean
    public DepartmentRepository departmentRepository() {
        return new DepartmentRepositoryImpl();
    }

    @Bean
    public EmployeeRepository employeeRepository() {
        return new EmployeeRepositoryImpl();
    }

    @Bean
    public ApplicationService applicationService() {
        return new ApplicationServiceImpl();
    }

}
