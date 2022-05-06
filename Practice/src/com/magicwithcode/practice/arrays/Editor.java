package com.magicwithcode.practice.arrays;

import java.util.HashMap;
import java.util.Map;

class Editor{

    public static void main(String[] args) {

        long[] a1 = {11, 1, 13, 21, 3, 7, 3};
        long[] a2 = {11, 3, 7, 1, 3};

        String result = isSubset(a1, a2);
        System.out.println(result);


    }

    private static String isSubset(long[] a1, long[] a2) {


        Map<Long, Integer> map = new HashMap<>();

        for(int i=0; i< a1.length; i++){

            if(map.containsKey(a1[i])){
                int count = map.get(a1[i]);
                map.put(a1[i], count+1 );
            }else{
                map.put(a1[i],1 );
            }

        }
        System.out.println(map);

        for(int i=0; i<a2.length; i++){

            if(map.containsKey(a2[i])){
                if(map.get(a2[i]) >0){
                    int count = map.get(a2[i]);
                    map.put(a2[i], count-1 );
                }else{
                    return "NO";
                }
            }else{
                return "NO";
            }

        }

        return "YES";
    }

    private static void printArray(int[] arr){
        for(int i: arr) System.out.print(i + " ");
    }

}