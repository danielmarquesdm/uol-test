package com.example.backend.controller;

import com.example.backend.dto.IMDayResponseDTO;
import com.example.backend.service.IMDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/im-day")
public class IMDayController {
    @Autowired
    private IMDayService imDayService;

    @GetMapping
    public ResponseEntity<List<IMDayResponseDTO>> getResolutionOrder() {
        return ResponseEntity.ok(imDayService.getResolutionOrder());
    }
}
