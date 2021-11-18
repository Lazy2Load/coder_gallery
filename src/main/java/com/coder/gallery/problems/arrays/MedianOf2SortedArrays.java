package com.coder.gallery.problems.arrays;

import java.util.ArrayList;
import java.util.List;

public class MedianOf2SortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        List<Integer> res = new ArrayList();

        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){

            if(nums1[i] < nums2[j]){
                res.add(nums1[i++]);
            }else{
                res.add(nums2[j++]);
            }
        }
        if(i < nums1.length){
            while(i<nums1.length){
                res.add(nums1[i++]);
            }
        }else if(j < nums2.length){
            while (j<nums2.length){
                res.add(nums2[j++]);
            }
        }
        System.out.println(res);
        double median;
        if(res.size()%2 == 0){
            int mid = (res.size()/2)-1;
            int midNxt = mid+1;
            median = (res.get(mid)+res.get(midNxt))/2.0;
        }else{
            median = res.get(res.size()/2);
        }
        return median;
    }

    public static void main(String[] args) {
//        int[] arr1 = new int[]{1,3};
//        int[] arr2 = new int[]{2};

//        int[] arr1 = new int[]{1,2};
//        int[] arr2 = new int[]{3,4};

        int[] arr1 = new int[]{0,0};
        int[] arr2 = new int[]{0,0};

        System.out.println(findMedianSortedArrays(arr1,arr2));
    }
}
