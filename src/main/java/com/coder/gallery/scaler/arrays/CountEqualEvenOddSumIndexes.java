package com.coder.gallery.scaler.arrays;

public class CountEqualEvenOddSumIndexes {
    public int solve(int[] A) {
        int n=A.length;
        int[] psEven = new int[n];
        int[] psOdd = new int[n];
        psEven[0] = A[0];
        psOdd[0] = 0;
        for(int i=1;i<n;i++){
            if(i%2 == 0){
                psEven[i] = psEven[i-1] + A[i];
                psOdd[i] = psOdd[i-1];
            }else{
                psEven[i] = psEven[i-1];
                psOdd[i] = psOdd[i-1] + A[i];
            }
        }
        int c=0;
        for(int i=0;i<n;i++) {
            int sumEven;
            int sumOdd;
            if(i==0){
                sumEven = psOdd[n-1];
                sumOdd = psEven[n-1];
            }else{
                sumEven = psEven[i-1] + (psOdd[n-1] - psOdd[i]);
                sumOdd = psOdd[i-1] + (psEven[n-1] - psEven[i]);
            }
            if(sumEven == sumOdd){
                c++;
            }
        }
        return c;
    }
}
