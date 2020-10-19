package com.cmf.dss.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.cmf.dss.provider.**.dao.mapper")
@ComponentScan({"com.cmf.dss.provider.**",
        "com.cmf.base.bsframework.exception"})
public class DssProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(DssProviderApplication.class, args);
    }
}
