package edu.xttc.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lzy
 * @create 2022-04-19 10:10
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello Spring Boot";
    }
}
