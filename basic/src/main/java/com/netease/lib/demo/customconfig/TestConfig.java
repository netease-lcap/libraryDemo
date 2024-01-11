package com.netease.lib.demo.customconfig;

import com.netease.lowcode.core.EnvironmentType;
import com.netease.lowcode.core.annotation.Environment;
import com.netease.lowcode.core.annotation.NaslConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 使用自定义环境变量
 */
@Component
public class TestConfig {
    @Value("${resName}")
    @NaslConfiguration(defaultValue = @Environment(type = EnvironmentType.DEV, value = "结果名称"))
    public String resName;

}
