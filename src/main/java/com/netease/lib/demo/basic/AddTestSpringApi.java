package com.netease.lib.demo.basic;


import com.netease.lib.structure.AddParam;
import com.netease.lowcode.core.annotation.NaslLogic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 非静态方法（spring bean）示例
 * 须在spring.factories中指定EnableAutoConfiguration
 * 3.3及以上版本支持
 */
@Component
public class AddTestSpringApi {
    private final Logger log = LoggerFactory.getLogger(AddTestSpringApi.class);

    /**
     * 相加
     *
     * @param addParam 参数对象
     * @return 相加的结果
     */
    @NaslLogic
    public Integer addByObject2(AddParam addParam) {
        return addParam.getA() + addParam.getB();
    }

}
