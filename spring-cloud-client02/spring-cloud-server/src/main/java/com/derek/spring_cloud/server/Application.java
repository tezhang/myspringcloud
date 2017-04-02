package com.derek.spring_cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RestController;
/**
 * springcloud 持续集成
 * @author derek
 *
 */
@RestController//注解为REST服务
//@EnableConfigServer//注解为配置中心
@EnableEurekaServer//注解为服务注册中心
@SpringBootApplication//启动main函数后，在控制台中可以发现启动了一个Tomcat容器，一个基于Spring MVC的应用也同时启动起来
public class Application {

	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
