package com.hxz.example.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hxz
 * @since 2016/10/05 12:34
 */
@Component
public class ComputeClientHystrix implements ComputeClient{

    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }
}
