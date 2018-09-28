package com.liqihua.eureka.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author liqihua
 * @since 2018/9/28
 */
@RestController
@RequestMapping("/loginController")
public class LoginController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/login")
    public String login(String username,String password) {
        System.out.println("--- login ...");
        String result = restTemplate.getForObject("http://eureka-provider/userController/findUser?username="+username+"&password="+password,String.class);
        System.out.println("login get result:"+result);
        return result;
    }



}
