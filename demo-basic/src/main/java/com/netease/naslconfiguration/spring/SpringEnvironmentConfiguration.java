package com.netease.naslconfiguration.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 加入spring环境配置（在spring.factories中指定）
 */
@Configuration
@ComponentScan(basePackages = "com.netease.naslconfiguration")
public class SpringEnvironmentConfiguration {
}
