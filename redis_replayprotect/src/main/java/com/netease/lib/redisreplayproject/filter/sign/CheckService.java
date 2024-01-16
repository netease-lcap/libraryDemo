package com.netease.lib.redisreplayproject.filter.sign;

import javax.servlet.http.HttpServletRequest;

public interface CheckService {
    /**
     * 安全检查
     *
     * @param request
     * @return
     */
    boolean check(HttpServletRequest request);
}
