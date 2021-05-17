package com.liu.uranus.data.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author liujiazhong
 * @date 2021/5/17 9:41
 */
@FeignClient("data-server")
public interface DataFeignClient {

    /**
     * test
     */
    @GetMapping("data/test")
    void test();

}
