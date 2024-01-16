package com.netease.lib.redisreplayproject.filter.sign;

public interface RedisService {
    boolean checkAndAddIfAbsent(String key, Long timeout);
}
