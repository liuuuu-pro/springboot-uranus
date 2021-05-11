package com.liu.uranus.server.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liujiazhong
 * @date 2021/5/11 11:18
 */
@Slf4j
@RestController
public class DemoController {

    @GetMapping("/")
    public Object hello() {
        return "hello uranus";
    }

}
