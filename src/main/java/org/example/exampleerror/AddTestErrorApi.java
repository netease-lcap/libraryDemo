package org.example.exampleerror;


import com.netease.lowcode.core.annotation.NaslLogic;
import org.example.structure.AddParam;
import org.example.structure.AddRes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 非静态方法（spring bean）示例
 * 3.3及以上版本支持
 */
@Component
public class AddTestErrorApi {
    private final Logger log = LoggerFactory.getLogger(AddTestErrorApi.class);

    /**
     * 抛出异常示例
     *
     * @param addParam
     * @return
     * @throws ClassNotFoundException
     */
    @NaslLogic
    public AddRes addByObjReturnObjException(AddParam addParam) throws IllegalArgumentException {
        AddRes addRes = new AddRes();
        addRes.setRes(addParam.getA() + addParam.getB());
        if (true) {
            log.info("IllegalArgumentException error!!!!");
            throw new IllegalArgumentException("IllegalArgumentException test exception");
        }
        return addRes;
    }
}
