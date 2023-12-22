package org.example.api;

import com.alibaba.fastjson.JSONObject;
import com.netease.lowcode.core.annotation.NaslLogic;
import org.example.api.structure.AddParam;
import org.example.config.TestConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 静态方法示例
 */
@Component
public class AddTestStatic {
    private static final Logger log = LoggerFactory.getLogger(AddTestStatic.class);
    private static TestConfig testConfig;

    /**
     * NaslConfiguration示例
     * 相加
     *
     * @param a 参数a
     * @param b 参数b
     * @return 相加的结果
     */
    @NaslLogic
    public static Integer add(Integer a, Integer b) {
        log.info(testConfig.resName);
        return a + b;
    }

    /**
     * 相加
     *
     * @param addParam 参数对象
     * @return 相加的结果
     */
    @NaslLogic
    public static Integer addByObject(AddParam addParam) {
        return addParam.getA() + addParam.getB();
    }

    @Autowired
    public void setTestConfig(TestConfig testConfig) {
        log.info("注解 static-----------：" + JSONObject.toJSONString(testConfig));
        AddTestStatic.testConfig = testConfig;
    }

}
