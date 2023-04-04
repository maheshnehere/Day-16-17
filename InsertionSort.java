package com.Bridgelabz;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the index = ");
        int n = scanner.nextInt();

        String[] words = new String[n];
        System.out.println("Enter the strings =");

        for (int i = 0; i < n; i++) {
            words[i] = scanner.next();
        }
        for (int i = 1; i < n; i++) {
            String key = words[i];
            int j = i - 1;
            while (j >= 0 && words[j].compareTo(key) > 0) {
                words[j + 1] = words[j];
                j = j - 1;
            }
            words[j + 1] = key;
        }
        System.out.println("Sorted list = ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
