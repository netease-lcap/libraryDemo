package com.netease.lib.demo.basic;

import com.alibaba.fastjson.JSONObject;
import com.netease.lowcode.core.annotation.NaslLogic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用map对象示例
 */
@Component
public class MapApi {
    private static final Logger log = LoggerFactory.getLogger(MapApi.class);

    /**
     * Map对象示例
     *
     * @param mapMap
     * @return
     */
    @NaslLogic
    public static Map<String, Map<String, Integer>> testMap(Map<String, Map<String, Integer>> mapMap) {
        Map<String, Integer> a1 = new HashMap<>();
        a1.put("a-1", 11);
        mapMap.put("a", a1);
        log.info(JSONObject.toJSONString(mapMap));
        return mapMap;
    }
}
