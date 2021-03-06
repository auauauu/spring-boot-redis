package com.guanglee.weixin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@MapperScan("com.guanglee.weixin.modular.**.mapper")
@EnableRedisHttpSession(maxInactiveIntervalInSeconds=3000)
public class SpringWeixinApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWeixinApplication.class, args);
    }
}
