package com.liqihua.eureka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author liqihua
 * @since 2018/9/28
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class RunEurekaConsumer {

    public static void main(String[] args) {
        SpringApplication.run(RunEurekaConsumer.class);
    }


    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }


}
