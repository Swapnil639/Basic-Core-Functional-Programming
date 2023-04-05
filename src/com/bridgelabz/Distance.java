package com.bridgelabz;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.println("Euclidean distance :"+ distance);
        
    }
}
