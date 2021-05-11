package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("feature/")
public class FeatureController {

    @GetMapping("one")
    public String feature() {
        return "feature one, 修复release版本bug";
    }
}
