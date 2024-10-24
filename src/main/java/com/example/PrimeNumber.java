package com.example;

public class PrimeNumber {

    //func for calculating prime numbers
    private boolean primeNumber(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public int countPrimeNumbers(int first, int last) {
        int count = 0;
        for (int i = first; i <= last; i++) {
            if (primeNumber(i)) {
                count++;
            }
        }
        return count;
    }

    public int sumOfPrimeNumbers(int first, int last) {
        int sum = 0;
        for (int i = first; i <= last; i++) {
            if (primeNumber(i)) {
                sum += i;
            }
        }
        return sum;
    }

    //message for number of prime numbers
    public void logPrimeNumbers(int count) {
        System.out.println("Hej, det finns " + count + " primtal mellan 0 och 1000!");
    }

    //message for sum of prime numbers
    public void logSumPrimeNumbers(int sum) {
        System.out.println("Och den totala summan av dessa primtal är " + sum + ".");
    }

    //run prime number main
    public static void main(String[] args) {
        PrimeNumber counter = new PrimeNumber();

        int first = 0;
        int last = 1000;

        int count = counter.countPrimeNumbers(first, last);
        int sum = counter.sumOfPrimeNumbers(first, last);
        counter.logPrimeNumbers(count);
        counter.logSumPrimeNumbers(sum);
    }

}
