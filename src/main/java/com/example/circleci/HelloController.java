package com.example.circleci;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {


    @GetMapping
    public ResponseEntity sayHello(@RequestParam("name") String name){

        return ResponseEntity.ok().body("hello "+name);
    }
}
