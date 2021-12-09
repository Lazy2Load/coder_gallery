package com.coder.gallery.scaler.arrays;

import java.util.Scanner;

/*
Problem Description

Write a program to print maximum and minimum elements of the input array A of size N where you have to take integer N and further N elements as input from user.



Problem Constraints

1 <= N <= 1000

1 <= A <= 1000


 */
public class MaxMinArray {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            ar[i] = s.nextInt();
            if(ar[i] < min) min = ar[i];
            if(ar[i] > max) max = ar[i];
        }
        System.out.print(max + " " + min);
    }
}
