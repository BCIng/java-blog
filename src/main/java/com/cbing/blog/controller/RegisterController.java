package com.cbing.blog.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "注册")
@RestController
public class RegisterController {
    @GetMapping("/register")
    @ApiOperation("测试Swagger功能")
    public String register(){
        return "register page";
    }
}
