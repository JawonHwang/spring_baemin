package com.baemin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration 
public class FileConfig implements WebMvcConfigurer{
	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/uploads/**").addResourceLocations("file:/home/ubuntu/uploads/");
		registry.addResourceHandler("/tracks/image/**").addResourceLocations("file:/home/ubuntu/tracks/image/");
		registry.addResourceHandler("/tracks/**").addResourceLocations("file:/home/ubuntu/tracks/");
		registry.addResourceHandler("/backgroundImages/**").addResourceLocations("file:/home/ubuntu/backgroundImages/");
		registry.addResourceHandler("/profileImages/**").addResourceLocations("file:/home/ubuntu/profileImages/");
	}
}
