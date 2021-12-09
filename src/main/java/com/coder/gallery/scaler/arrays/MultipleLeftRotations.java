package com.coder.gallery.scaler.arrays;

public class MultipleLeftRotations {

    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 4, 5};
        int[] B = new int[]{1};
        int[][] solve = solve(A, B);
        System.out.println(solve);
    }

    static int[][] solve(int[] A, int[] B) {
        int n = A.length;
        int[][] res = new int[B.length][n];
        for(int i=0;i<B.length;i++){
            int[] temp = A.clone();
            rotate(temp,B[i]%n,n);
            res[i] = temp;
        }
        return res;
    }

    static void rotate(int[] temp, int k, int n){
        rev(temp,0,n-1);
        rev(temp,0,n-k-1);
        rev(temp,n-k,n-1);
    }

    static void rev(int[] arr, int start, int end){
        while(start<end){
            int t = arr[start];
            arr[start] = arr[end];
            arr[end] = t;
            start++;
            end--;
        }
    }
}
