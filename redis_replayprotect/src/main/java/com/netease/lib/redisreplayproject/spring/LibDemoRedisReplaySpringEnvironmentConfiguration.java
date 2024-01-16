package com.netease.lib.redisreplayproject.spring;

import com.netease.lib.redisreplayproject.LibraryAutoScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * 加入spring环境配置（在spring.factories中指定）
 */
@Configuration
@ComponentScan(basePackageClasses = LibraryAutoScan.class)
public class LibDemoRedisReplaySpringEnvironmentConfiguration {
    public LibDemoRedisReplaySpringEnvironmentConfiguration() {
        System.out.println("LibDemoRedisSpringEnvironmentConfiguration");
    }
}
