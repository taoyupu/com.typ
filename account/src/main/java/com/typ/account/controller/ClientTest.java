package com.typ.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述: descript
 *
 * @author 陶玉璞
 * @version V1.0
 */

@RestController
public class ClientTest {

    @GetMapping("/getMessage")
    public String getMessage() {
        return "hello, I am client.";
    }
}
