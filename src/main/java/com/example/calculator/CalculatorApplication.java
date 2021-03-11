package com.example.calculator;
import java.math.BigDecimal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
        Calculator calculator = new Calculator();
        System.out.println(calculator.addTwoNumbers(new BigDecimal("3.3"),new BigDecimal("4.5")));
        System.out.println(calculator.substractTwoNumbers(new BigDecimal("3.3"),new BigDecimal("4.5")));
    }


}
