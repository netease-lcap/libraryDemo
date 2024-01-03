package com.netease.lib.demo.basic;

import com.netease.lib.structure.AddParam;
import com.netease.lowcode.core.annotation.NaslLogic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 静态方法示例
 */
public class AddTestStaticApi {
    private static final Logger log = LoggerFactory.getLogger(AddTestStaticApi.class);

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

}
