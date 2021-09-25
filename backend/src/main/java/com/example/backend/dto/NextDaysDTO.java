package com.example.backend.dto;

import com.example.backend.utils.DayOfWeekEnum;
import lombok.Data;

import java.time.LocalDate;

@Data
public class NextDaysDTO {
    private DayOfWeekEnum dayOfWeek;
    private LocalDate date;
}
