package com.example.jenkinsstudy2.service;

import org.springframework.stereotype.Service;

@Service
public class MainService {

    final String START_MESSAGE = "Change Message Hello Jenkins and Ansible";

    public String getStartMessage() {
        return this.START_MESSAGE;
    }
}
