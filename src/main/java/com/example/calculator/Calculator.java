package com.example.calculator;

import java.math.BigDecimal;

public class Calculator {

    public BigDecimal addTwoNumbers(BigDecimal x, BigDecimal y){
        BigDecimal sum;
        sum = x.add(y);
        return sum;
    }
    public BigDecimal substractTwoNumbers(BigDecimal x, BigDecimal y){
        BigDecimal sum;
        sum = x.subtract(y);
        return sum;
    }
}
