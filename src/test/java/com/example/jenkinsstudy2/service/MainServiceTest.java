package com.example.jenkinsstudy2.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("MainServiceTest")
class MainServiceTest {


    MainService mainService = new MainService();

    @Test
    @DisplayName("getMainMessage")
    void getMessageTest() {
        String message = mainService.getStartMessage();
        assertThat(message).isNotEmpty();
    }
}