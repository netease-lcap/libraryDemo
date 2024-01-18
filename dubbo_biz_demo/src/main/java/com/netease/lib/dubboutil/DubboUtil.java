package com.netease.lib.dubboutil;

import com.netease.lowcode.core.annotation.NaslLogic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Dubbo消费者调用工具类
 */
@Component
public class DubboUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(DubboUtil.class);

    /**
     * todo 引入Dubbo服务接口
     *
     * @return
     */
//    @DubboReference
//    private XXXService xxxService;
    @NaslLogic
    public String test() {
        //todo 调用dubbo方法
        //xxxService.xxx();
        return "test";
    }
}
