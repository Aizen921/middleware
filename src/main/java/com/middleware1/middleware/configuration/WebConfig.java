package com.middleware1.middleware.configuration;

import com.middleware1.middleware.interceptors.APILoggingIngterceptor;
import com.middleware1.middleware.interceptors.LegacyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private APILoggingIngterceptor apiLoggingIngterceptor;
    @Autowired
    private LegacyInterceptor legacyInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
      registry.addInterceptor(apiLoggingIngterceptor);
      registry.addInterceptor(legacyInterceptor);
    }
}
