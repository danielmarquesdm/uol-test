package com.example.backend.service;

//import com.example.backend.controller.dto.IMDayDTO;
import com.example.backend.dto.IMDayResponseDTO;
import com.example.backend.dto.NextDaysDTO;
import com.example.backend.model.Responsavel;
import com.example.backend.repository.IMDayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class IMDayService {
    @Autowired
    private IMDayRepository imDayRepository;

    public List<IMDayResponseDTO> getResolutionOrder() {
        List<IMDayResponseDTO> list = Collections.emptyList();
        List<Responsavel> responsaveis = imDayRepository.findAll();

        List<IMDayResponseDTO> imDayDTOList = responsaveis.stream().map(responsavel -> {
            IMDayResponseDTO imDayResponseDTO = new IMDayResponseDTO();

            LocalDate yesterday = LocalDate.now().minusDays(1);
            if(!yesterday.equals(DayOfWeek.SATURDAY) || !yesterday.equals(DayOfWeek.SUNDAY)) {
                NextDaysDTO nextDaysDTO = new NextDaysDTO();
//                nextDaysDTO.setDayOfWeek(yesterday.getDayOfWeek());
                imDayResponseDTO.setNextDays(nextDaysDTO);
            }
            imDayResponseDTO.setResponsavel(responsavel.getName());
            return imDayResponseDTO;
        }).collect(Collectors.toList());

        return Collections.emptyList();
    }
}
