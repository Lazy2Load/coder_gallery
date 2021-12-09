package com.coder.gallery.scaler.arrays;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=1;i<=t;i++){
            int n = s.nextInt();
            int max = -1;
            int smax = -1;
            for(int j=0;j<n;j++){
                int val = s.nextInt();
                if(val > max){
                    smax = max;
                    max = val;
                }else if(val > smax){
                    smax = val;
                }
            }
            System.out.println(smax);
        }
    }
}
