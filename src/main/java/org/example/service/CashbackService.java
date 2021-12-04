package org.example.service;

import org.example.dto.CashbackRequestsDTO;
import org.example.dto.CashbackResponseDTO;
import org.springframework.stereotype.Component;

@Component
public class CashbackService {

    public CashbackResponseDTO calculate(CashbackRequestsDTO requestsDTO) {
        final int limit = 3000;
        final int percent = 3;

        final int cashback = requestsDTO.getAmount() * percent / 100;
        if (cashback > limit) {
            return new CashbackResponseDTO(limit);
        }

        return new CashbackResponseDTO(cashback);
    }
}
