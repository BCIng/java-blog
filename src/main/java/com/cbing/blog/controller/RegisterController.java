package com.cbing.blog.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 类描述：
 *
 * @ClassName RegisterController
 * @Description TODO  
 * @Author CBing
 * @Date 2020/12/8 17:16
 */
@Api(tags = "注册")
@RestController
public class RegisterController {
    @GetMapping("/register")
    public String register(){
        return "register page";
    }
}
