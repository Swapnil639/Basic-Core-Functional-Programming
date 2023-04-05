package com.bridgelabz;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        System.out.print("Enter 2D array size : ");
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        int columns=scanner.nextInt();

        System.out.println("Enter array elements : ");

        int[][] twoD=new int[rows][columns];

        for(int i=0; i<rows;i++)
        {
            for(int j=0; j<columns;j++)
            {
                twoD[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Data you entered :");
        for(int []x:twoD){
            for(int y:x){
                System.out.print(y+"  ");
            }
            System.out.println();
        }
    }
}
