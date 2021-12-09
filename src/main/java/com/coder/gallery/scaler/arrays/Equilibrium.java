package com.coder.gallery.scaler.arrays;

public class Equilibrium {
    public static int solve(int[] A) {
        int n= A.length;
        int[] ps = new int[n];
        ps[0] = A[0];
        for(int i=1;i<n;i++){
            ps[i] = ps[i-1] + A[i];
        }
        for(int i=0;i<n;i++){
            int left,right;
            if(i==0) {
                left = 0;
            }else{
                left = ps[i-1];
            }
            right = ps[n-1] - ps[i];
            if(left == right){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 7, 1, 2, 3};
        System.out.println(solve(A));
    }
}
