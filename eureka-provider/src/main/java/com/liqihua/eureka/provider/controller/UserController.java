package com.liqihua.eureka.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

/**
 * @author liqihua
 * @since 2018/9/28
 */
@RestController
@RequestMapping("/userController")
public class UserController {


    @RequestMapping("/findUser")
    public String findUser(String username,String password) {
        System.out.println("findUser get username:"+username+",password:"+username);
        String user = "user-"+Math.random();
        System.out.println("user:"+user);
        return user;
    }


}
