package com.example;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CalculatorTest { 

    private Calculator calculator;

    @Mock
    private CalculatorService service;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this); 
        calculator = new Calculator(service);
    }

    @Test
    public void testAdd() {
        when(service.add(2, 3)).thenReturn(5);
        assertEquals(5, calculator.add(2, 3));
        verify(service).add(2, 3); 
    }

    @Test
    public void testSubtract() {
        when(service.subtract(3, 1)).thenReturn(2);
        assertEquals(2, calculator.subtract(3, 1));
        verify(service).subtract(3, 1); 
    }

    @Test
    public void testMultiply() {
        when(service.multiply(2, 3)).thenReturn(6);
        assertEquals(6, calculator.multiply(2, 3));
        verify(service).multiply(2, 3); 
    }
}

//     }
//  //  public void setUp() {
// //  calculator = new Calculator();
// //  }
// // private Calculator calculator;
//  @Test
//  public void testAdd() {
//  assertEquals(5, calculator.add(2, 3));
//  assertEquals(-1, calculator.add(-2, 1));
//  }

//  @Test
//  public void testSubtract() {
//  assertEquals(1, calculator.subtract(3, 2));
//  assertEquals(-3, calculator.subtract(-2, 1));
//  }

//  @Test
//  public void testMultiply() {
//  assertEquals(6, calculator.multiply(2, 3));
//  assertEquals(-6, calculator.multiply(-2, 3));
//  }


// public void testDivide() {
//     assertEquals(2.0, calculator.divide(6, 3), 0.001); 
    
//     try {
//         calculator.divide(1, 0);
//         fail("Expected IllegalArgumentException to be thrown");
//     } catch (IllegalArgumentException e) {
//         assertEquals("Cannot divide by zero", e.getMessage());
//     }
// }

// @Test
// public void testPower() {
//     assertEquals(8.0, calculator.power(2, 3), 0.001);
//     assertEquals(1.0, calculator.power(2, 0), 0.001);
//     assertEquals(0.5, calculator.power(2, -1), 0.001);
// }

// @Test
// public void testSquareRoot() {
//     assertEquals(3.0, calculator.squareRoot(9), 0.001);
//     try{
//         calculator.squareRoot(-1);
//         fail("Expected IllegalArgumentException to be thrown");
//     } catch (IllegalArgumentException e) {
//         assertEquals("Cannot take square root of a negative number", e.getMessage());
//     }
// }

//  @Test
//  public void testFactorial() {
//     assertEquals(24, calculator.factorial(4)); 
//     assertEquals(1, calculator.factorial(0));   
//     try{
//         calculator.factorial(-1);
//         fail("Expected IllegalArgumentException to be thrown");
//     }catch (IllegalArgumentException e) {
//         assertEquals("Cannot calculate factorial of a negative number", e.getMessage());
//     }
// }
