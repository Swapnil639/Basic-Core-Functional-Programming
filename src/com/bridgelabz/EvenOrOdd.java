package com.bridgelabz;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter number :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n % 2 == 0)
            System.out.print(n + " is Even number");
        else
            System.out.print(n + " is Odd number");

    }
}
