package com.liqihua.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author liqihua
 * @since 2018/9/28
 */
@EnableEurekaServer
@SpringBootApplication
public class RunEurekaServer {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(RunEurekaServer.class);
        app.run(args);
    }
}
