package com.example.backend.service;

import com.example.backend.controller.dto.IMDayDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Service
public class IMDayService {

    public List<IMDayDTO> getResolutionOrder() {
        IMDayDTO imDayDTO = new IMDayDTO();
        imDayDTO.setData(LocalDate.now());
        imDayDTO.setResponsavel("João");
        return Collections.singletonList(imDayDTO);
    }
}
