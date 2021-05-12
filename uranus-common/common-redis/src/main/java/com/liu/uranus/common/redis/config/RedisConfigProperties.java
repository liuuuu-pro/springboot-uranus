package com.liu.uranus.common.redis.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author liujiazhong
 * @date 2021/5/12 11:02
 */
@Data
@ConfigurationProperties("redis")
public class RedisConfigProperties {

    private String host;
    private Integer port;
    private String password;
    private Integer database;
    private Integer maxTotal;
    private Integer maxIdle;
    private Integer timeBetweenEvictionRunsMillis;
    private Integer minEvictableIdleTimeMillis;
    private Boolean testOnBorrow;
    private Integer maxWaitMillis;
    private Integer socketTimeout;
    
}
