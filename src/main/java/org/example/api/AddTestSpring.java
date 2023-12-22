package org.example.api;


import com.netease.lowcode.core.annotation.NaslLogic;
import org.example.api.structure.AddParam;
import org.example.api.structure.AddRes;
import org.example.config.TestConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 非静态方法（spring bean）示例
 * 3.3及以上版本支持
 */
@Component
public class AddTestSpring {
    private final Logger log = LoggerFactory.getLogger(AddTestSpring.class);

    @Autowired
    private TestConfig testConfig;

    /**
     * NaslStructure自定义结构 示例
     * 根据对象相加
     *
     * @param addParam
     * @return 返回对象结果
     */
    @NaslLogic
    public AddRes addByObjReturnObj(AddParam addParam) {
        AddRes addRes = new AddRes();
        addRes.setResName(testConfig.resName);
        addRes.setRes(addParam.getA() + addParam.getB());
        return addRes;
    }

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
        addRes.setResName(testConfig.resName);
        addRes.setRes(addParam.getA() + addParam.getB());
        if (true) {
            log.info("IllegalArgumentException error!!!!");
            throw new IllegalArgumentException("IllegalArgumentException test exception");
        }
        return addRes;
    }

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
