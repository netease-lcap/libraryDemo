package com.netease.lib.demo.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DemoFilter implements Filter {
    public static final String LOGIC_IDENTIFIER_SEPARATOR = ":";
    private Logger logger = LoggerFactory.getLogger(DemoFilter.class);

    private static List<String> apiWhiteList() {
        List<String> verifyApis = Arrays.asList("/api/user");
        List<String> systemApis = Arrays.asList("/api/system");
        List<String> healthApis = Arrays.asList("/management/");
        List<String> whiteList = new ArrayList<>();
        whiteList.addAll(verifyApis);
        whiteList.addAll(systemApis);
        whiteList.addAll(healthApis);
        return whiteList;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String requestURI = request.getRequestURI();
        String method = request.getMethod();
        String logicIdentifier = requestURI + LOGIC_IDENTIFIER_SEPARATOR + method;
        // 1. 判断是否为白名单接口（认证、登录、流程相关系统逻辑接口）
        for (String allAuthApi : apiWhiteList()) {
            if (logicIdentifier.startsWith(allAuthApi)) {
                logger.warn("白名单逻辑{}", logicIdentifier);
                filterChain.doFilter(servletRequest, servletResponse);
                return;
            }
        }

        // 2. dosomething
        logger.info("filter dosomething");

        filterChain.doFilter(servletRequest, servletResponse);
    }
}
