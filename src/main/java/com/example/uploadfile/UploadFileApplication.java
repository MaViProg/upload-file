package com.example.uploadfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class UploadFileApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(UploadFileApplication.class, args);
    }

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/admin").setViewName("admin");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/webjars/**")
                .addResourceLocations("/webjars/");
    }

}
