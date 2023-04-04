package com.bridgelabz;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        int result = 1, base = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Power :");
        int power = scanner.nextInt();
        for (int i = 1; i <= power; i++) {
            result = result * base;
        }
        System.out.println("Result is: " + result);
    }
}
