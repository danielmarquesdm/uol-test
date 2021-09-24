package com.example.backend.controller.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class IMDayDTO {
    private LocalDate data;
    private String responsavel;
}
