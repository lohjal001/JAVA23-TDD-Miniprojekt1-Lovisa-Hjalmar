package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
class PrimeNumberTest {

    @Test
    @DisplayName("prime numbers up to 10")
    public void countPrimeNumbersToTen() {
        PrimeNumber counter = new PrimeNumber();
        int result = counter.countPrimeNumbers(0, 10);

        assertEquals(4, result, "there should be 4 prime numbers 0-10"); //2, 3 ,5 , 7
    }

    @Test
    @DisplayName("sum of prime numbers 0-10")
    public void sumPrimeNumbersToTen() {
        PrimeNumber counter = new PrimeNumber();
        int result = counter.sumOfPrimeNumbers(0, 10);

        assertEquals(17, result, "sum of prime numbers 0-10 should be 17"); //2+3+5+7 = 17
    }

    @Test
    @DisplayName("prime numbers between 1000")
    public void countPrimeNumbersToOneThousand() {
        PrimeNumber counter = new PrimeNumber();
        int result = counter.countPrimeNumbers(0, 1000);
        assertEquals(168, result, "there should be 168 prime numbers 0-1000"); //168 prime numbers 0-1000
    }

    @Test
    @DisplayName("Test for sum of prime numbers between 1-1000")
    public void sumPrimeNumbersToOneThousand() {
        PrimeNumber counter = new PrimeNumber();
        int result = counter.sumOfPrimeNumbers(0, 1000);
        assertEquals(76127, result, "sum of prime numbers 1-1000 should be 76127");//168 numbers with sum 76127
    }

    @Test
    @DisplayName("test if first is negative")
    public void firstIsNegative() {
        PrimeNumber counter = new PrimeNumber();
        int result = counter.countPrimeNumbers(-1, 0);
        assertFalse(result > 0, "first should be 0");
    }

    @Test
    @DisplayName("test if last is negative")
    public void lastIsNegative() {
        PrimeNumber counter = new PrimeNumber();
        int result = counter.countPrimeNumbers(0, -100);
        assertFalse(result > 0, "last should be a positive number");
    }

    @Test
    @DisplayName("test if both are negative")
    public void negativeRangeTest() {
        PrimeNumber counter = new PrimeNumber();
        int result = counter.countPrimeNumbers(-100, -1);

        assertEquals(0, result, "negative numbers are not primes");
    }


    @Test
    @DisplayName("test if numbers are null")
    public void numberIsNull() {
        PrimeNumber counter = new PrimeNumber();
        int result = counter.countPrimeNumbers( 0, 0);
        assertFalse(result > 0, "numbers cant both be 0");
    }

    @Test
    @DisplayName("if first number is bigger than last number in interval")
    public void biggerFirstThanLast() {
        PrimeNumber counter = new PrimeNumber();
        int result = counter.countPrimeNumbers(1000, 100);
        assertFalse(result > 0, "first number should be smaller than last number");
    }

    @Test
    @DisplayName("if range is the same")
    public void singleNumberInRange() {
        PrimeNumber counter = new PrimeNumber();
        int primeCount = counter.countPrimeNumbers(7, 7);
        int primeSum = counter.sumOfPrimeNumbers(7, 7);

        assertEquals(1, primeCount, "7 is a prime so count should be 1");
        assertEquals(7, primeSum, "7 is a prime so sum should be 7");
    }


    @Test
    @DisplayName("test if logPrimeNumbers message works")
    void testLogPrimeNumbers() {
        // Redirect System.out to capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        try {
            PrimeNumber counter = new PrimeNumber();
            counter.logPrimeNumbers(168);

            String output = outputStream.toString().trim();

            assertTrue(output.contains("Hej, det finns 168 primtal mellan 0 och 1000!"),
                    "Output should contain the correct message for prime count");

        } finally {
            System.setOut(originalOut);
        }
    }

    @Test
    @DisplayName("test if logSumPrimeNumbers message works")
    void testLogSumPrimeNumbers() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        try {
            PrimeNumber counter = new PrimeNumber();
            counter.logSumPrimeNumbers(76127);

            String output = outputStream.toString().trim();

            assertTrue(output.contains("Och den totala summan av dessa primtal är 76127."),
                    "Output should contain the correct message for sum");

        } finally {
            System.setOut(originalOut);
        }
    }

}