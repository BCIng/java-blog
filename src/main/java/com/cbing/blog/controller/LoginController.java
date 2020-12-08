package com.cbing.blog.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "登录")
@RestController
public class LoginController {
    @GetMapping("/login")
    @ApiOperation("测试Swagger功能")
    public  String login(){
        return  "Login page";
    }
}
