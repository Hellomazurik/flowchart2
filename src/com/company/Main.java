package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while(true) {
            System.out.println("How many numbers should there be in the array? Pick a number between 1 and 10000");
            n = sc.nextInt();
            if (n < 1 || n > 10000) {
                System.out.println("Number is not accepted. Please choose a number between 1 and 10000.");
            } else {
                break;
            }
        }

            System.out.println("Specify the contents of the array; numbers should be separated by a space. Only first " + n + " numbers will be accounted for.");
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int count = 0;
            for (int d = 1; d < arr.length; d++) {
                if(arr[d] > arr[d-1]) {
                    count++;
                }
            }

            System.out.println("In the array, there are " + count + " elements that are bigger than a previous element.");

    }
}
