package com.coder.gallery.scaler.arrays;

import java.util.Scanner;

/*
Problem Description

You are given an integer T (Number of test cases). For each test case, you are given array A and an integer B. You have to tell whether B is present in array A or not.



Problem Constraints

1 <= T <= 10

1 <= |A| <= 105

1 <= A[i], B <= 109



Input Format

First line of the input contains a single integer T.

Next, each of the test case consists of 2 lines:

First line begins with an integer |A| denoting the length of array, and then |A| integers denote the array elements.
Second line contains a single integer B


Output Format

For each test case, print on a separate line 1 if the element exists, else print 0.



Example Input

Input 1:

 1
 5 4 1 5 9 1
 5
Input 2:

 1
 3 7 7 2
 1


Example Output

Output 1:

 1
Output 2:

 0
 */
public class SearchElement {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();
        for(int i=0;i<cases;i++){
            readInput(s);
        }
    }

    static void readInput(Scanner s){
        int n = s.nextInt();
        int[] ar = new int[n];
        for(int j=0;j<n;j++){
            ar[j] = s.nextInt();
        }
        int b = s.nextInt();
        findB(ar,b);
    }

    static void findB(int[] ar, int b){
        for(int i=0;i<ar.length;i++){
            if(ar[i] == b) {
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);
    }
}
