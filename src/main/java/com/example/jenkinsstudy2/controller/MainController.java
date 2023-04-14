package com.example.jenkinsstudy2.controller;

import com.example.jenkinsstudy2.domain.dto.MainDto;
import com.example.jenkinsstudy2.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final MainService mainService;

    @GetMapping("/")
    public MainDto mainPage() {
        MainDto mainDto = new MainDto();
        mainDto.setId(1L);
        mainDto.setName("첫 배포");
        mainDto.setStatus("200:OK");
        mainDto.setMessage(mainService.getStartMessage());
        return mainDto;
    }
}
