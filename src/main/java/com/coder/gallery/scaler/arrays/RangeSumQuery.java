package com.coder.gallery.scaler.arrays;

public class RangeSumQuery {
    public static void main(String[] args) {
        int[] A = new int[]{7, 3, 1, 5, 5, 5, 1, 2, 4, 5};
        int[][] B = new int[5][2];
        
//        int[][] solve = rangeSum(A, B);
//        System.out.println(solve);
    }

    static long[] rangeSum(int[] A, int[][] B) {
        int n = A.length;
        int[] ps = new int[n];
        ps[0] = A[0];
        for(int i=1;i<n;i++){
            ps[i] = ps[i-1] + A[i];
        }
        long[] res = new long[B.length];
        for(int j=0;j<B.length;j++){
            int l = B[j][0];
            int r = B[j][1];
            if(l==0){
                res[j] = ps[r];
            } else{
                res[j] = ps[r] - ps[l-1];
            }
        }
        return res;
    }
}
