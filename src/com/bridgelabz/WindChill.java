package com.bridgelabz;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter temperature :");
        int t=scanner.nextInt();

        System.out.println("Enter Wind Speed :");
        int v=scanner.nextInt();

        if (t<50){
            if ((v>3) || (v<120)){
                double windChill=(35.74)+(0.6215*t)+(0.4275*t-35.75)*Math.pow(v,0.16);
                System.out.println(windChill);
            }
            else {
                System.out.println("The value of Wind Speed in mph must be between 3 and 120");
            }
        }
        else {
            System.out.println("The value of temperature in Fahrenheit cannot be larger that 50");
        }
    }
}
