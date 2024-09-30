package com.ckw.billSplitter.logging;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

public class LoggingInterceptor implements HandlerInterceptor {
    // Logger for this class
    private static final Logger logger = LoggerFactory.getLogger(LoggingInterceptor.class);

    @Override
    // Logs HTTP method and URI before the request is handled
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        logger.info("Request: {} {}", request.getMethod());
        return true;  // Allows the request to proceed
    }

    @Override
    // Logs response status and URI after request completion. Logs exceptions if any
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        logger.info("Response: {} {}", response.getStatus(), request.getRequestURI());
        if (ex != null) {
            // Logs any exception
            logger.error("Exception: ", ex);
        }
    }
}
