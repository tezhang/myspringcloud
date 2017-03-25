package com.derek.spring_cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication//启动main函数后，在控制台中可以发现启动了一个Tomcat容器，一个基于Spring MVC的应用也同时启动起来
@RestController//注解为REST服务
@EnableConfigServer//springcloud 注解关键字
public class Application {

	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
