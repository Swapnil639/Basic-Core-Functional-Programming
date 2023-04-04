package com.bridgelabz;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        int i = 2, temp;
        System.out.print("Enter any number :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        temp = n;
        while (temp > 1) {
            if (temp % i == 0) {
                System.out.print(i + " , ");
                temp = temp / i;
            } else {
                i++;
            }

        }
    }
}
