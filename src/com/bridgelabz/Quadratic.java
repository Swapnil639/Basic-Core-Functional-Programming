package com.bridgelabz;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        //ax^2+bx+c=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number :");
        double a=scanner.nextInt();
        double b=scanner.nextInt();
        double c=scanner.nextInt();
        double root1,root2;

        double delta=b*b-4*a*c;
        System.out.println(delta);


        root1=(-b+Math.sqrt(delta))/2*a;
        System.out.println(root1);
        root2=(-b-Math.sqrt(delta))/2*a;
        System.out.println(root2);

    }
}
