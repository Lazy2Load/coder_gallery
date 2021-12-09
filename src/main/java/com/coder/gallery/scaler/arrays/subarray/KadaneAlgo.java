package com.coder.gallery.scaler.arrays.subarray;

/*
Problem Description

Find the contiguous subarray within an array, A of length N which has the largest sum.



Problem Constraints

1 <= N <= 1e6
-1000 <= A[i] <= 1000



Input Format

The first and the only argument contains an integer array, A.



Output Format

Return an integer representing the maximum possible sum of the contiguous subarray.



Example Input

Input 1:

 A = [1, 2, 3, 4, -10]
Input 2:

 A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]


Example Output

Output 1:

 10
Output 2:

 6


 */
public class KadaneAlgo {
    public int maxSubArray(final int[] A) {
        int n = A.length;
        int max = A[0];
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += A[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }

        }
        return max;
    }
}
