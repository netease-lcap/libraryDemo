package com.netease.lib.redisreplayproject.filter.sign.impl;

import com.netease.lib.redisreplayproject.filter.sign.RedisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * redis存储实现类
 */
@Component
public class RedisRedisServiceImpl implements RedisService {
    private static final Logger logger = LoggerFactory.getLogger(RedisRedisServiceImpl.class);
    @Resource
    private RedisTemplate redisTemplate;

    /**
     * 从redis获取
     *
     * @param key
     * @return
     */
    public String getValue(final String key) {
        Object value = redisTemplate.opsForValue().get(key);
        if (value == null) {
            return null;
        }
        return String.valueOf(value);
    }

    /**
     * 设置 Redis 中指定 key 的值为指定字符串，指定过期时间
     *
     * @param key     Redis 中的键
     * @param value   Redis 中的值
     * @param timeout 过期时间
     */
    public String setValueTimeOut(String key, String value, Long timeout) {
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        ops.set(key, value, timeout, TimeUnit.SECONDS);
        return ops.get(key);
    }

    @Override
    public boolean checkAndAddIfAbsent(String key, Long timeout) {
        try {
            //由于防重放方案需要前端传入header，本例中不存在前端，所以直接给key赋值
            key = "replay test";
            String nonceExist = this.getValue(key);
            if (nonceExist != null) {
                logger.info("key:{} 已存在", key);
                return false;
            } else {
                this.setValueTimeOut(key, key, 60 * 1000L);
            }
            return true;
        } catch (Exception e) {
            logger.error("", e);
        }
        return false;
    }
}
