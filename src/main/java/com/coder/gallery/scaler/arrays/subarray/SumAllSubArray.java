package com.coder.gallery.scaler.arrays.subarray;

public class SumAllSubArray {

    public long subarraySum(int[] A) {
        int n = A.length;
        long sum = 0L;
        for(int i=0;i<n;i++){
            long l = i+1;
            long r = n-i;
            sum += l*r*A[i];
        }
        return sum;
    }
}
