package com.example.addressapp.configuration;

import com.example.addressapp.filters.MyFilters;
import com.example.addressapp.intercepter.LoggingIntercepter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private LoggingIntercepter loggingIntercepter;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(loggingIntercepter)
               .addPathPatterns("/api/**");
    }
}
