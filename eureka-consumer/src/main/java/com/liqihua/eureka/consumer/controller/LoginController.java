package com.liqihua.eureka.consumer.controller;

import com.liqihua.eureka.consumer.service.UserService;
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
    @Autowired
    UserService userService;//报找不到这个bean不用管，@FeignClient会使这个Bean在程序启动的时候注入


    /**
     * 方式一
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/login1")
    public String login1(String username,String password) {
        System.out.println("--- login1 ...");
        String result = restTemplate.getForObject("http://eureka-provider/userController/findUser?username="+username+"&password="+password,String.class);
        System.out.println("login1 get result:"+result);
        return result;
    }


    /**
     * 方式二
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/login2")
    public String login2(String username,String password) {
        System.out.println("--- login2 ...");
        String result = userService.findUser(username,password);
        System.out.println("login2 get result:"+result);
        return result;
    }



}
