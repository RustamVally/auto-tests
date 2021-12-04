package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.CashbackRequestsDTO;
import org.example.dto.CashbackResponseDTO;
import org.example.service.CashbackService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
@RequestMapping("/cashback")
public class CashbackController {
    private final CashbackService service;


    @PostMapping("/calculate")
    public CashbackResponseDTO calculate(@RequestBody CashbackRequestsDTO requestsDTO) {
      return service.calculate(requestsDTO);
    }
}
