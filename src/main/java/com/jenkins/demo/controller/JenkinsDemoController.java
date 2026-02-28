package com.jenkins.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class JenkinsDemoController {

    @GetMapping("/welcome")
    public String welcomeJenkins(){
        return "Welcome to Jenkins CI/CD flow Demo";
    }
    @GetMapping("/ollama")
    public String addOllama(){
        return "Run with Local Ollama";
    }
}
