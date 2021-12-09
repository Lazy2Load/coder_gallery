package com.coder.gallery.scaler.arrays.subarray;

/*
Problem Description
Given an array of size N, Find the subarray with least average of size k.



Problem Constraints
1<=k<=N<=1e5
-1e5<=A[i]<=1e5


Input Format
First argument contains an array A of integers of size N.
Second argument contains integer k.


Output Format
Return the index of the first element of the subarray of size k that has least average.
Array indexing starts from 0.


Example Input
Input 1:
A=[3, 7, 90, 20, 10, 50, 40]
B=3
Input 2:

A=[3, 7, 5, 20, -10, 0, 12]
B=2


Example Output
Output 1:
3
Output 2:

4


Example Explanation
Explanation 1:
Subarray between indexes 3 and 5
The subarray {20, 10, 50} has the least average
among all subarrays of size 3.
Explanation 2:

 Subarray between [4, 5] has minimum average
 */
public class SubArrayLeastAverage {
    public int solve(int[] A, int B) {
        int n = A.length;
        int[] ps = new int[n];
        ps[0] = A[0];
        for(int i=1;i<n;i++){
            ps[i] = ps[i-1] + A[i];
        }

        int min = Integer.MAX_VALUE;
        int mini = n;
        int s=0, e=B-1;
        for(;s<=n-B;s++,e++){
            int sum;
            if(s==0){
                sum = ps[e];
            }else{
                sum = ps[e]-ps[s-1];
            }
            if(sum < min){
                min = sum;
                mini = s;
            }
        }
        return mini;
    }
}
