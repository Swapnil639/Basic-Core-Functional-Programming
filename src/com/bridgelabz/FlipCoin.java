package com.bridgelabz;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int heads=0;
        int tails=0;
        int count=1;
        double random=Math.random();
        System.out.print("please enter the number :");
        Scanner sc = new Scanner(System.in);
        int flips = sc.nextInt();

        while(count <= flips){
            System.out.println(count+" "+random);
            if(random<0.5){
                heads++;
                System.out.println("heads");
            }else{
                tails++;
                System.out.println("tails");
            }count++;
        }
        System.out.println();
        System.out.println("Number of heads :"+heads);
        System.out.println("Number of tails :"+tails);

        double headPercent = heads/flips*100;
        double tailPercent = tails/flips*100;

        System.out.println("Percentage of Heads :"+headPercent);
        System.out.println("Percentage of Tails :"+tailPercent);
    }
}
