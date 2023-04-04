package com.bridgelabz;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        int dividend,divisor;
        System.out.print("Enter Value :");
        Scanner sc = new Scanner(System.in);
        dividend=sc.nextInt();
        divisor=sc.nextInt();
        int quotient=dividend/divisor;
        int remainder=dividend%divisor;
        System.out.println("Quotient = "+quotient);
        System.out.println("Remainder = "+remainder);
    }
}
