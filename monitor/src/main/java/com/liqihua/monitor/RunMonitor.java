package com.liqihua.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liqihua
 * @since 2018/9/29
 */

@EnableEurekaClient
@EnableAdminServer
@SpringBootApplication
public class RunMonitor {

    public static void main(String[] args) {
        SpringApplication.run(RunMonitor.class);
    }

}
