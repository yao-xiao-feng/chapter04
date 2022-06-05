package com.chapter04.config;

import org.springframework.context.annotation.Configuration;
 import org.springframework.web.servlet.config.annotation.ViewControllerRegistration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    public void  addViewControllers(ViewControllerRegistration registration){

    }
}
