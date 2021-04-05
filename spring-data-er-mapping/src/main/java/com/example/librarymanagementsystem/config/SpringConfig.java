package com.example.librarymanagementsystem.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.example.librarymanagementsystem")
@PropertySource("application.properties")
public class SpringConfig {
}
