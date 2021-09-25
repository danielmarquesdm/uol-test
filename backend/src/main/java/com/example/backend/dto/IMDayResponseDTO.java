package com.example.backend.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class IMDayResponseDTO {
    private NextDaysDTO nextDays;
    private String responsavel;
}
