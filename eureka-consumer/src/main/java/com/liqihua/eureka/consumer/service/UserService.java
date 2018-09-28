package com.liqihua.eureka.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author liqihua
 * @since 2018/9/28
 */

@FeignClient(value = "eureka-provider")
public interface UserService {

    @RequestMapping(value = "/userController/findUser",method = RequestMethod.GET)
    String findUser(@RequestParam("username") String username,@RequestParam("password") String password);

}
