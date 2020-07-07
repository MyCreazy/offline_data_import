package com.tjh.excel_template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Hello world!
 */
@SpringBootApplication
@ImportResource({"classpath:urule-core-context.xml"})
public class App {
    public static void main(String[] args) {
        //从Spring中获取KnowledgeService接口实例
        SpringApplication.run(App.class, args);
    }
}
