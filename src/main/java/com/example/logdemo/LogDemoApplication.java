package com.example.logdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LogDemoApplication {

    @RestController
    public static class MyController {

        private static Logger log = LoggerFactory.getLogger(MyController.class);

        @GetMapping("abc")
        public String abc() {
            MDC.put("abc", "def");
            log.info("Abc");
            return "abc";
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(LogDemoApplication.class, args);
    }

}
