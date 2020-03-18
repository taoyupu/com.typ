package com.typ.account.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述: descript
 *
 * @author 陶玉璞
 * @version V1.0
 */

@RestController
@RefreshScope
public class ClientTest {

    @Value("${env}")
    public String env;

    @GetMapping("/env")
    public String getEnv() {
        return env;
    }

    @GetMapping("/getMessage")
    public String getMessage() {
        return "hello, I am client.";
    }
}
