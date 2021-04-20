package dev.andrylat.banking.mortgagecalculator.calculator;

import dev.andrylat.banking.mortgagecalculator.validation.InputDataStorage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MonthlyPaymentCalculatorTest {

    MonthlyPaymentCalculator calculator;
    InputDataStorage inputData;

    @BeforeEach
    void createValidator() {
        calculator = new MonthlyPaymentCalculator();
        inputData = new InputDataStorage();
    }

    @Test
    public void calculate_CalculateMonthlyPaymentData_DataCalculatedCorrectly() {
        inputData.setLoanAmount("1000");
        inputData.setInterestRate("6");
        inputData.setTermYears("1");

        double expected = 86.07d;
        double actual = calculator.calculate(inputData);
        assertEquals(expected, actual);
    }

}