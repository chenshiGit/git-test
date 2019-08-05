package com.mijing.config.crossOrigin;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by 陈实 on 2019/7/7.
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer{
    //解决跨域问题
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowCredentials(true)
                .allowedMethods("GET", "HEAD", "POST","PUT", "DELETE", "OPTIONS")
                .maxAge(3600);
    }
}
