package com.kwy.springboot01.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 孔维一
 * @date 2020 2020/8/2 1:34
 * @version 1.0.0
 */
@Controller
public class HelloController {
    private String str;
    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}



