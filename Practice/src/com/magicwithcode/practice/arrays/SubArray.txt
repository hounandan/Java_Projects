package com.magicwithcode.practice.arrays;

// { Driver Code Starts
import java.util.*;
import java.lang.*;

class SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }

            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here

        ArrayList<Integer> result = new ArrayList<>();

        first: for(int i=0; i< n-1; i++){
            long checkSum = arr[i];
            for(int j = i+1; j< n; j++){
                checkSum = checkSum + arr[j];
                if(checkSum == s){
                    result.add(i+1);
                    result.add(j+1);
                    break first;
                }
                if(checkSum > s){
                    break ;
                }


            }

        }
        if(result.size()< 1){
            result.add(-1);
        }

        return result;

    }
}