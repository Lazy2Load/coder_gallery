package com.coder.gallery.scaler.arrays;

public class PickFromBothSides {

    static int solve(int[] A, int B) {
        int n = A.length;
        int[] ps = new int[n];
        ps[0] = A[0];
        for(int i=1;i<n;i++){
            ps[i] = ps[i-1] + A[i];
        }
        int[] ss = new int[n+1];
        ss[n] = 0;
        ss[n-1] = A[n-1];
        for(int i=n-2;i>=0;i--){
            ss[i] = ss[i+1] + A[i];
        }
        int max = ss[n-B];
        for(int i=0;i<B;i++){
            int pSum = ps[i];
            int sSum = ss[n - B + (i+1)];
            max = Math.max(max,(pSum+sSum));
        }
        return max;
    }

    public static void main(String[] args) {
        int[] A = new int[]{-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35};
        int B = 48;
        System.out.println(solve(A,B));
    }
}
