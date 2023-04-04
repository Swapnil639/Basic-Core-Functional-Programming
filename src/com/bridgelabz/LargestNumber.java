package com.bridgelabz;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a > b && a > c)
            System.out.println("A is large :" + a);
        else if (b > a && b > c)
            System.out.println("B is greater :" + b);
        else
            System.out.println("C is greater :" + c);
    }
}
