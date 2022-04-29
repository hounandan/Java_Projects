package com.magicwithcode.practice.arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Editor {


    public static void main(String[] args) {

        int[] arr = {12, 11, 40, 12, 5, 6, 5, 12, 11};

        findDuplicates(arr);

    }

    private static void findDuplicates(int[] arr) {

        Map<Integer, Integer> occurrence = new TreeMap<>();

        int count = 0;
        for(int i=0; i<arr.length; i++){

            if(occurrence.containsKey(arr[i])){
                count = occurrence.get(arr[i]);
                occurrence.put(arr[i], count + 1);
            }else{
                occurrence.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer, Integer> i : occurrence.entrySet()){

            if(i.getValue() > 1){
                System.out.print(i.getKey() + " ");
            }

        }

    }

    private static void printArray(int[] arr) {
        for(int i: arr) System.out.print(i + " ");
    }


}
