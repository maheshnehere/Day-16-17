package com.Bridgelabz;

public class PrimeNumber {
    public static void main(String[] args) {
        int input = 1000;

        for (int i = 2; i < input; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

