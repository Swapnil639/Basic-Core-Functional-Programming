package com.bridgelabz;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        int a, b, c;
        System.out.print("Enter two number :");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Before swapping :" + a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping :" + a + " " + b);
    }
}
