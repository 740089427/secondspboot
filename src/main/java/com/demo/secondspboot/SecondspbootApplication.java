package com.demo.secondspboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.demo.secondspboot.mapper")//扫包
public class SecondspbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondspbootApplication.class, args);
    }

}

