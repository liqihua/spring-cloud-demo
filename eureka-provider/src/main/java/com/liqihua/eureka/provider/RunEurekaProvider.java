package com.liqihua.eureka.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liqihua
 * @since 2018/9/28
 */
@SpringBootApplication
@EnableEurekaClient
public class RunEurekaProvider {

    public static void main(String[] args) {
        SpringApplication.run(RunEurekaProvider.class);
    }
}
