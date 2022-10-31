package com.example.divisionquerydemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.divisionquerydemo.mapper")
public class DivisionQueryDemoApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(DivisionQueryDemoApplication.class, args);
    }
    
}
