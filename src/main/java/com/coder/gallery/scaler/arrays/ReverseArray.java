package com.coder.gallery.scaler.arrays;

public class ReverseArray {
    public int[] solve(final int[] A) {
        int n = A.length;
        int i=0, j=n-1;
        while(i<j){
            A[i] = A[i] + A[j];
            A[j] = A[i] - A[j];
            A[i] = A[i] - A[j];
            i++;
            j--;
        }
        return A;
    }
}
