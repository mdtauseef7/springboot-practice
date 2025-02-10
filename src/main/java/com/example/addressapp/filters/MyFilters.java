package com.example.addressapp.filters;

import jakarta.servlet.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Slf4j
public class MyFilters implements Filter
{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("MyFilters init(): ");
       Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("pre MyFilters doFilter: ");
        filterChain.doFilter(servletRequest,servletResponse);
        log.info("post MyFilters doFilter: ");
    }

    @Override
    public void destroy() {
        log.info("MyFilters destroy(): ");
       Filter.super.destroy();
    }
}
