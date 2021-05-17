package com.liu.uranus.data.feign.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @author liujiazhong
 * @date 2021/5/17 9:31
 */
@Configuration
@EnableFeignClients("com.liu.uranus.data.feign.client")
public class DataFeignAutoConfigure {

}
