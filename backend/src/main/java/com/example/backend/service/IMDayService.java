package com.example.backend.service;

import com.example.backend.controller.dto.IMDayDTO;
import com.example.backend.model.Responsavel;
import com.example.backend.repository.IMDayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Service
public class IMDayService {
    @Autowired
    private IMDayRepository imDayRepository;

    public List<IMDayDTO> getResolutionOrder() {
        List<IMDayDTO> list = Collections.emptyList();
        List<Responsavel> responsaveis = imDayRepository.findAll();

        responsaveis.stream().forEach(responsavel -> {
            
        });

        IMDayDTO imDayDTO = new IMDayDTO();
        imDayDTO.setData(LocalDate.now());
        imDayDTO.setResponsavel("João");
        return Collections.singletonList(imDayDTO);
    }
}
