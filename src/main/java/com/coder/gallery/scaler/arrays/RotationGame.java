package com.coder.gallery.scaler.arrays;

import java.util.Scanner;
/*
Problem Description

You are given an integer array A and an integer B. You have to print the same array after rotating it B times towards right.

NOTE: You can use extra memory.



Problem Constraints

1 <= |A| <= 106

1 <= A[i] <= 109

1 <= B <= 109

Example Input

Input 1:

 4 1 2 3 4
 2
Input 2:

 3 1 2 2
 3


Example Output

Output 1:

 3 4 1 2
Output 2:

 1 2 2
 */
public class RotationGame {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = s.nextInt();
        }
        int b = s.nextInt();
        b = b%n;
        rev(ar,0,n-1);
        rev(ar,0,b-1);
        rev(ar,b,n-1);
        for(int i=0;i<n;i++){
            System.out.print(ar[i]);
            System.out.print(" ");
        }
    }

    static void rev(int[] ar, int i, int j){
        while(i<j){
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
            i++;
            j--;
        }
    }
}
