package com.pc.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * created by pengchao on 2019/12/2.
 */

@SpringBootApplication
@EnableConfigServer
public class Config3344_App {

    public static void main(String[] args) {
        SpringApplication.run(Config3344_App.class,args);
    }
}
