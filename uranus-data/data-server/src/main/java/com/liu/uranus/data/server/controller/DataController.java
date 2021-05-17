package com.liu.uranus.data.server.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liujiazhong
 * @date 2021/5/17 9:46
 */
@Slf4j
@RestController
@RequestMapping("data")
public class DataController {

    @GetMapping("test")
    public void test() {
        log.info("test...");
    }

}
