package com.bridgelabz;

public class SumOfThreeInteger {
    public static void main(String[] args) {
        int[] arr = {1, -2, 6, 3, 2, 0, 1, -5};
        boolean found = false;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        found=true;
                    }
                }
            }
        }
        if (found == false)
            System.out.println(" not exist ");
    }
}
