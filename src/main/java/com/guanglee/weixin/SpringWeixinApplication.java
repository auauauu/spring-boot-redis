package com.guanglee.weixin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.guanglee.weixin.modular.**.mapper")
public class SpringWeixinApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWeixinApplication.class, args);
    }
}
