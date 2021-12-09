package com.coder.gallery.scaler.arrays.matrices;

public class RotateMatrix {
    static int[][] solve(int[][] A) {
        int n = A.length;
        A = transpose(A);
        for(int i=0;i<n;i++){
            int s=0,e=n-1;
            while(s<e){
                int temp = A[i][s];
                A[i][s] = A[i][e];
                A[i][e] = temp;
                s++;
                e--;
            }
        }
        return A;
    }

    static int[][] transpose(int[][] A){
        int n = A.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) break;
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;

            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[][] A= {{1, 2}, {3, 4}};
        int[][] ans = solve(A);
        System.out.println(ans);
    }
}
