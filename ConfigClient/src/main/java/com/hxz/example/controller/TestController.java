package com.hxz.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hxz
 * @since 2016/10/06 16:26
 */
@RefreshScope
@RestController
public class TestController {
    @Value("${version}")
    private String version;

    @RequestMapping("/version")
    public String from() {

        return this.version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
