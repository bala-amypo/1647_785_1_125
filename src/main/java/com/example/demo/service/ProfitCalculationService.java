package com.example.demo.service;

import com.example.demo.entity.ProfitCalculationRecord;

public interface ProfitCalculationService {

    ProfitCalculationRecord calculateProfit(Long id);

    ProfitCalculationRecord getCalculationById(Long id);
}
