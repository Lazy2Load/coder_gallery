package com.coder.gallery.scaler.arrays.matrices;

public class AntiDiagonals {
    static int[][] diagonal(int[][] A) {
        int n = A.length;
        int[][] ans = new int[(2*n)-1][n];
        int k=0;
        for(int j=0;j<n;j++){
            int x=0;
            int y=j;
            int l=0;
            while(x<n && y>=0){
                ans[k][l++] = A[x][y];
                x++;
                y--;
            }
            while(l<n){
                ans[k][l++] = 0;
            }
            k++;
        }
        for(int i=1;i<n;i++){
            int x=i;
            int y=n-1;
            int l=0;
            while(x<n && y>=0){
                ans[k][l++] = A[x][y];
                x++;
                y--;
            }
            while(l<n){
                ans[k][l++] = 0;
            }
            k++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3},
                     {4, 5, 6},
                     {7, 8, 9}};
        int[][] diagonals = diagonal(A);
        System.out.println(diagonals);
    }
}
