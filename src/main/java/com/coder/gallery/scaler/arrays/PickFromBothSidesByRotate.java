package com.coder.gallery.scaler.arrays;

/*
Problem Description

Given an integer array A of size N.

You can pick B elements from either left or right end of the array A to get maximum sum.

Find and return this maximum possible sum.

NOTE: Suppose B = 4 and array A contains 10 elements then

You can pick first four elements or can pick last four elements or can pick 1 from front and 3 from back etc . you need to return the maximum possible sum of elements you can pick.


Problem Constraints

1 <= N <= 105

1 <= B <= N

-103 <= A[i] <= 103



Input Format

First argument is an integer array A.

Second argument is an integer B.



Output Format

Return an integer denoting the maximum possible sum of elements you picked.



Example Input

Input 1:

 A = [5, -2, 3 , 1, 2]
 B = 3
Input 2:

 A = [1, 2]
 B = 1


Example Output

Output 1:

 8
Output 2:

 2
 */
public class PickFromBothSidesByRotate {

    public static void main(String[] args) {
        int[] A = new int[]{5, -2, 3 , 1, 2};
        int B = 3;
        System.out.println(solve(A,B));
    }

    static int solve(int[] A, int B) {
        int n= A.length;
        int c = B;
        int[] temp = A.clone();
        int max = getSum(temp,0,B);
        while(c > 0){
            rotate(temp,0,n);
            int sum = getSum(temp,0,B);
            if(max < sum){
                max = sum;
            }
            c--;
        }
        return max;
    }

    static int getSum(int[] arr, int start, int end){
        int sum=0;
        for(int i=start; i<end;i++){
            sum += arr[i];
        }
        return sum;
    }

    static void rotate(int[] temp, int k, int n){
        rev(temp,0,n-1);
        rev(temp,0,k);
        rev(temp,k+1,n-1);
    }

    static void rev(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
