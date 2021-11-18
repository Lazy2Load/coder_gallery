package com.coder.gallery.problems.dp;

//https://leetcode.com/problems/trapping-rain-water/
public class TrappingRainWater {
    int[] left;
    int[] right;

    public int trap(int[] height) {
        left = new int[height.length];
        right = new int[height.length];
        int max = Integer.MIN_VALUE;

        for(int i=0;i<height.length;i++){
            max = Math.max(max,height[i]);
            left[i] = max;
        }

        max = Integer.MIN_VALUE;
        for(int i=height.length-1;i>=0;i--){
            max = Math.max(max,height[i]);
            right[i] = max;
        }

        int max_water = Integer.MIN_VALUE;
        for(int i=0;i<height.length;i++){
            max_water = Math.min(left[i],right[i]) - height[i];
        }
        return max_water;
    }
}
