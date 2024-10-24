package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

}