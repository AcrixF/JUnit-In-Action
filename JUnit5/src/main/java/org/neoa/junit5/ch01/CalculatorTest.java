package org.neoa.junit5.ch01;

public class CalculatorTest {

    private int nbErrors = 0;


    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();
        try {
            test.testAdd();
        } catch (Throwable e) {
            test.nbErrors++;
            e.printStackTrace();
        }
        if (test.nbErrors > 0) {
            throw  new IllegalArgumentException("There were " + test.nbErrors + "error(s)");
        }
    }

    private static void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 50);
        if (result != 60) {
            System.out.println("Bad result: " + result);
        }
    }
}
