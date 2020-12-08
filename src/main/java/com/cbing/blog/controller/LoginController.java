package com.cbing.blog.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 类描述：
 *
 * @ClassName LoginController
 * @Description TODO
 * @Author CBing
 * @Date 2020/12/8 16:58
 */
@Api(tags = "登录")
@RestController
public class LoginController {
    @GetMapping("/login")
    public  String login(){
        return  "Login page";
    }
}
