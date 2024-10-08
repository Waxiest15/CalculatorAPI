package com.example.CalculatorAPI.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
@Entity
public class CalculationLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String result;

    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "expression_id")
    private Expression expression;
}
