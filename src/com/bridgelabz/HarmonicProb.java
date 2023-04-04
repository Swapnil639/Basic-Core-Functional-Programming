package com.bridgelabz;

import java.util.Scanner;

public class HarmonicProb {
    public static void main(String[] args) {
        //Hn = 1+ 1/2 + 1/3 + .........+1/n
        System.out.print("Enter n value : ");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double sum = 0;
        while (n > 0) {
            sum = sum + (1 / n);
            n--;

        }
        System.out.println(" Harmonic value is :" + sum);
    }
}
