package com.netease.lib.api;


import com.netease.lib.structure.AddParam;
import com.netease.lowcode.core.annotation.NaslLogic;
import com.netease.lib.structure.AddRes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 静态方法抛出异常示例
 */
public class AddTestErrorApi {
    private static final Logger log = LoggerFactory.getLogger(AddTestErrorApi.class);

    /**
     * 抛出异常示例
     *
     * @param addParam
     * @return
     * @throws ClassNotFoundException
     */
    @NaslLogic
    public static AddRes addByObjReturnObjException(AddParam addParam) throws IllegalArgumentException {
        AddRes addRes = new AddRes();
        addRes.setRes(addParam.getA() + addParam.getB());
        if (true) {
            log.info("IllegalArgumentException error!!!!");
            throw new IllegalArgumentException("IllegalArgumentException test exception");
        }
        return addRes;
    }
}
