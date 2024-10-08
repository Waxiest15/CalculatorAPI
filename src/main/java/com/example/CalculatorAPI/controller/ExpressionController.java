package com.example.CalculatorAPI.controller;

import com.example.CalculatorAPI.model.Expression;
import com.example.CalculatorAPI.service.ExpressionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expressions")
public class ExpressionController {
    private final ExpressionService expressionService;

    public ExpressionController(ExpressionService expressionService) {
        this.expressionService = expressionService;
    }

    @PostMapping
    public Expression createExpression(@RequestBody Expression expression) {
        return expressionService.saveExpression(expression);
    }

    @GetMapping
    public List<Expression> getAllExpressions() {
        return expressionService.getAllExpressions();
    }

    @GetMapping("/{id}")
    public Expression getExpressionById(@PathVariable Long id) {
        return expressionService.getExpressionById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteExpression(@PathVariable Long id) {
        expressionService.deleteExpression(id);
    }
}
