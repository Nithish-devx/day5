package com.example.demo.nithish;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class yoker {

@GetMapping("/")

public String get(@RequestParam String name) {

return "hi"+name;

}

}