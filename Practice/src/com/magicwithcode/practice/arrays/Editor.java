package com.magicwithcode.practice.arrays;


import java.util.HashMap;

public class Editor {


    public static void main(String[] args) {

        int[] arr = {1,5,7,1};

        int result = getPairsCount(arr,4,6);
        System.out.println(result);



    }

    private static int getPairsCount(int[] arr, int n, int k){

        HashMap<Integer, Integer> map = new HashMap<>();

        int count;
        for(int i=0; i<arr.length; i++){

            if(map.containsKey(arr[i])){
                count = map.get(arr[i]);
                map.put(arr[i], count+1);
            }else{
                map.put(arr[i],1);
            }
        }
        System.out.println(map);

        int result=0;
        for(int i=0; i<arr.length; i++){
            if(null != map.get(k - arr[i]) ){
                result += map.get(k - arr[i]);
            }

            if(k - arr[i] == arr[i]) result--;
        }

        return result/2;
    }

    private static void printArray(int[] arr) {
        for(int i: arr) System.out.print(i + " ");
    }


}
