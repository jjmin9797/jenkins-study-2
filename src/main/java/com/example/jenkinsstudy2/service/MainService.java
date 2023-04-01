package com.example.jenkinsstudy2.service;

import org.springframework.stereotype.Service;

@Service
public class MainService {

    final String START_MESSAGE = "HELLO SPRING BOOT";

    public String getStartMessage() {
        return this.START_MESSAGE;
    }
}
