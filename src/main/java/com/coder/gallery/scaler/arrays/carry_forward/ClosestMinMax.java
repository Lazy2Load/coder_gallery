package com.coder.gallery.scaler.arrays.carry_forward;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ClosestMinMax {
    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        int min = Collections.min(A);
        int max = Collections.max(A);

        if(min == max) return 1;
        int ans = n;
        int mini = -1;
        int maxi = -1;


        for(int i=n-1;i>=0;i--){
            if(A.get(i) == max){
                maxi = i;
                if(mini != -1){
                    ans = Math.min(ans,mini-maxi+1);
                }
            }else if(A.get(i) == min){
                mini = i;
                if(maxi != -1){
                    ans = Math.min(ans,maxi-mini+1);
                }
            }
        }
        return ans;
    }
}
