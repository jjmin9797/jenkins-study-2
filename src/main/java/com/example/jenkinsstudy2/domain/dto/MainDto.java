package com.example.jenkinsstudy2.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class MainDto {

    private Long id;
    private String name;
    private String status;
    private String message;
}
