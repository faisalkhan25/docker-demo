package com.code.dockerdemo.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @GetMapping("/greet/{name}")
    public ResponseEntity<String> greet(@PathVariable String name) {
        return new ResponseEntity<>("Hello " + name, HttpStatus.OK);
    }
    @GetMapping("/welcome/{fieldName}")
    public ResponseEntity<String> welcome(@PathVariable String fieldName) {
        return ResponseEntity.ok("Welcome to " + fieldName);
    }
    @GetMapping("/goodbye")
    public ResponseEntity<String> goodbye() {
        return ResponseEntity.ok("Goodbye");
    }
}
