package com.example.gundo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:5173")  // 許可するオリジンを指定
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // 許可するHTTPメソッドを指定
                .allowCredentials(true);  // クレデンシャル情報を許可
    }
}