package org.mysqltoredisjson;

import com.redis.om.spring.annotations.EnableRedisDocumentRepositories;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRedisDocumentRepositories
@MapperScan("org.mysqltoredisjson.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}