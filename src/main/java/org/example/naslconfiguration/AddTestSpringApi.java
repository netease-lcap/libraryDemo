package org.example.naslconfiguration;


import com.netease.lowcode.core.annotation.NaslLogic;
import org.example.structure.AddParam;
import org.example.structure.AddRes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 非静态方法（spring bean）示例
 * 3.3及以上版本支持
 */
@Component
public class AddTestSpringApi {
    private final Logger log = LoggerFactory.getLogger(AddTestSpringApi.class);

    @Autowired
    private TestConfig testConfig;

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
}
