package com.cmf.ieis.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.cmf.ieis.provider.**.dao.mapper")
@ComponentScan({"com.cmf.ieis.provider.**",
        "com.cmf.base.bsframework.exception.**"})
public class IeisProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(IeisProviderApplication.class, args);
    }
}
