package com.coder.gallery.scaler.arrays.carry_forward;

import java.util.ArrayList;

/*
Problem Description

Given an integer array A containing N distinct integers, you have to find all the leaders in the array A.

An element is leader if it is strictly greater than all the elements to its right side.

NOTE:The rightmost element is always a leader.



Problem Constraints

1 <= N <= 105

1 <= A[i] <= 108



Input Format

First and only argument is an integer array A.



Output Format

Return an integer array denoting all the leader elements of the array.

NOTE: Ordering in the output doesn't matter.



Example Input

Input 1:

 A = [16, 17, 4, 3, 5, 2]
Input 2:

 A = [1, 2]


Example Output

Output 1:

 [17, 2, 5]
Output 2:

 [2]
 */
public class LeadersInArray {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<Integer> res = new ArrayList();
        res.add(A.get(n-1));
        int max = A.get(n-1);
        for(int i=n-2;i>=0;i--){
            if(A.get(i) > max){
                max = A.get(i);
                res.add(A.get(i));
            }
        }
        return res;
    }
}
