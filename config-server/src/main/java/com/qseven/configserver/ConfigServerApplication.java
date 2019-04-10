package com.qseven.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigServerApplication {

    /*
     * 根据Git仓库配置文件名称命名，这里正确的访问方式：http://localhost:8762/config-client/dev
     * */

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }

}
