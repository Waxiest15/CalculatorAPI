package com.example.CalculatorAPI.repository;

import com.example.CalculatorAPI.model.CalculationLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalculationLogRepository extends JpaRepository<CalculationLog, Long> {
    //Extra queries if needed
}
