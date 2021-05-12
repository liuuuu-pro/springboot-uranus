package com.liu.uranus.server.controller;

import com.liu.uranus.common.redis.core.RedisCache;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author liujiazhong
 * @date 2021/5/11 11:18
 */
@Slf4j
@RestController
public class DemoController {

    private final RedisCache redisCache;
    private final RedissonClient redissonClient;

    public DemoController(RedisCache redisCache, RedissonClient redissonClient) {
        this.redisCache = redisCache;
        this.redissonClient = redissonClient;
    }

    @GetMapping("/")
    public Object hello() {
        return "hello uranus";
    }

    @GetMapping("add")
    public void testRedis() {
        RLock lock = redissonClient.getLock("uranus:test:lock");
        try {
            boolean result = lock.tryLock(60, TimeUnit.SECONDS);
            if (result) {
                Long increment = redisCache.increment("uranus:test:times", 1L);
                log.info("current value:{}", increment);
            } else {
                log.warn("lock fail.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            log.error("add exception.", e);
        } finally {
            lock.unlock();
        }
    }

}
