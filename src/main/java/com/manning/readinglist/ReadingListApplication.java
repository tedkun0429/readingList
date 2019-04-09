package com.manning.readinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
    SpringBootApplication 注解开启组件扫描和自动配置
 */

@SpringBootApplication
public class ReadingListApplication {

    public static void main(String[] args) {

        SpringApplication.run(ReadingListApplication.class, args);//负责启动引导程序
    }

}
