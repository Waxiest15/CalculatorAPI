package com.example.CalculatorAPI.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Map;

@Entity
@Data
@Builder
public class Expression {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String expression;

    @ElementCollection
    @MapKeyColumn(name="variable")
    @Column(name="value")
    @CollectionTable(name="expression_variables", joinColumns=@JoinColumn(name="expression_id"))
    private Map<String, Double> variables;

    private Double result;
    private LocalDateTime timestamp;

    public Expression(Long id) {
        this.id = id;
    }

}
