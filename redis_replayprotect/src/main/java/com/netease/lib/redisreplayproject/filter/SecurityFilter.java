package com.netease.lib.redisreplayproject.filter;

import com.netease.lib.redisreplayproject.filter.sign.CheckService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class SecurityFilter extends CommonsRequestLoggingFilter {
    public static final String LOGIC_IDENTIFIER_SEPARATOR = ":";
    private Logger logger = LoggerFactory.getLogger(SecurityFilter.class);
    @Autowired
    private CheckService checkService;

    public SecurityFilter() {
        logger.info("SecurityFilter init");
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        String method = request.getMethod();
        String logicIdentifier = requestURI + LOGIC_IDENTIFIER_SEPARATOR + method;
        //以/xxxx为例
//        if (!logicIdentifier.startsWith("/xxxx")) {
//            filterChain.doFilter(request, response);
//            return;
//        }
        if (!checkService.check(request)) {
            response.setContentType("application/json");
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(checkService + "校验请求拦截");
            return;
        }
        logger.info("SecurityFilter check success");
        filterChain.doFilter(request, response);
    }
}
