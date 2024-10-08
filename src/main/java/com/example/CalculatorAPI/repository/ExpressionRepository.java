package com.example.CalculatorAPI.repository;

import com.example.CalculatorAPI.model.Expression;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpressionRepository extends JpaRepository<Expression, Long> {
    //Extra queries if needed
}
