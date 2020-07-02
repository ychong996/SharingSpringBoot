package com.ychong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan("com.ychong.*")
public class AppDelegate {
    public static void main(String[] args) {
        SpringApplication.run(AppDelegate.class,args);
    }
}
