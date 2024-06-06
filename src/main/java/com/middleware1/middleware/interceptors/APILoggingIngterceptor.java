package com.middleware1.middleware.interceptors;

import io.micrometer.common.lang.Nullable;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class APILoggingIngterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String userAgent  = request.getHeader("User-Agent");
        System.out.println ("User-Agent: " + userAgent);
       return true;
    }

}
