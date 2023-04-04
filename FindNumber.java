package com.Bridgelabz;
import java.util.Scanner;
public class FindNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input =");
        int input = sc.nextInt();
        int max = (int) Math.pow(2, input) - 1;
        int min = 0;
        int guess = 0;
        for (int i = 0; i < input; i++) {
            guess = (max + min) / 2;
            System.out.print("Is the number between " + min + " and " + guess + "? (true/false): ");
            boolean response = sc.nextBoolean();
            if (response) {
                max = guess;
            } else {
                min = guess + 1;
            }
        }
        System.out.println("The number is: " + guess);
    }
}
