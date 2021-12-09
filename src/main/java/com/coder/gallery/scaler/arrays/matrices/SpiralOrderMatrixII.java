package com.coder.gallery.scaler.arrays.matrices;

public class SpiralOrderMatrixII {

    static int[][] generateMatrix(int A) {
        int n = A;
        int c=1;
        int[][] ans = new int[n][n];
        int i=0,j=0;
        if(n==1) {
            ans[0][0] = 1;
            return ans;
        }
        while(n>=1){
            for(int k=1;k<n;k++){
                ans[i][j] = c++;
                j++;
            }
            for(int k=1;k<n;k++){
                ans[i][j] = c++;
                i++;
            }
            for(int k=1;k<n;k++){
                ans[i][j] = c++;
                j--;
            }
            for(int k=1;k<n;k++){
                ans[i][j] = c++;
                i--;
            }
            i++;
            j++;
            n = n-2;
        }
        if(n%2 != 0){
            ans[i-1][j-1] = c;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] ans = generateMatrix(3);
        System.out.println(ans);
    }
}
