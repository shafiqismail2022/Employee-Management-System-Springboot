package com.beginner.demoApplication.config;
import com.beginner.demoApplication.services.EmployeeMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public EmployeeMapper employeeMapper() {
        return new EmployeeMapper();
    }
}