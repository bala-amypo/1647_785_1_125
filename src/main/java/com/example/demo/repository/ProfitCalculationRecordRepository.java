package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface ProfitCalculationRecordRepository
        extends JpaRepository<ProfitCalculationRecord, Long> {
}
