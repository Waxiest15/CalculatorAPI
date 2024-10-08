package com.example.CalculatorAPI.service;

import com.example.CalculatorAPI.model.Expression;
import com.example.CalculatorAPI.repository.ExpressionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpressionService {

    private final ExpressionRepository expressionRepository;

    @Autowired
    public ExpressionService(ExpressionRepository expressionRepository){
        this.expressionRepository = expressionRepository;
    }

    public Expression saveExpression(Expression expression) {
        return expressionRepository.save(expression);
    }

    public List<Expression> getAllExpressions() {
        return expressionRepository.findAll();
    }

    public Expression getExpressionById(Long id) {
        return expressionRepository.findById(id).orElseThrow(() -> new RuntimeException("Expression not found"));
    }

    public void deleteExpression(Long id) {
        expressionRepository.deleteById(id);
    }
}
