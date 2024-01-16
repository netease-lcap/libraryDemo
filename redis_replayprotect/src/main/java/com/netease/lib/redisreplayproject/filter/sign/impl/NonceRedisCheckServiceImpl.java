package com.netease.lib.redisreplayproject.filter.sign.impl;

import com.netease.lib.redisreplayproject.config.Constants;
import com.netease.lib.redisreplayproject.filter.sign.CheckService;
import com.netease.lib.redisreplayproject.filter.sign.RedisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Component
public class NonceRedisCheckServiceImpl implements CheckService {
    private Logger logger = LoggerFactory.getLogger(NonceRedisCheckServiceImpl.class);
    @Resource
    private RedisService redisService;

    @Override
    public boolean check(HttpServletRequest request) {
        RequestHeader requestHeader = new RequestHeader(request.getHeader(Constants.LIB_SIGN_HEADER_NAME), request.getHeader(Constants.LIB_TIMESTAMP_HEADER_NAME), request.getHeader(Constants.LIB_NONCE_HEADER_NAME));
//      todo  判断当前时间和timestamp的关系。
//      todo  校验timestamp、nonce和sign的关系。
//        查询redis看60s内是否存在
        return redisService.checkAndAddIfAbsent(requestHeader.getNonce() + requestHeader.getTimestamp(), 60 * 1000L);
    }

    public static class RequestHeader {
        private String sign;
        private String timestamp;
        private String nonce;

        public RequestHeader(String sign, String timestamp, String nonce) {
            this.sign = sign;
            this.timestamp = timestamp;
            this.nonce = nonce;
        }

        public String getSign() {
            return sign;
        }

        public void setSign(String sign) {
            this.sign = sign;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public String getNonce() {
            return nonce;
        }

        public void setNonce(String nonce) {
            this.nonce = nonce;
        }
    }
}
