package com.example.jenkinsstudy2.controller;

import com.example.jenkinsstudy2.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final MainService mainService;

    @GetMapping("/")
    public String mainPage() {
        return mainService.getStartMessage();
    }
}
