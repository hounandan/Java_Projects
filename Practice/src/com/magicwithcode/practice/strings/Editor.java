package com.magicwithcode.practice.strings;

import java.nio.charset.StandardCharsets;

class Editor{

    public static void main(String[] args) {

        String[] arr = {"geeksforgeeks", "geeks", "geeks",
                "geeksr"};

        String result = longestCommonPrefix(arr);
        System.out.println(result);

    }

    private static String longestCommonPrefix(String[] arr){

        String min = findMin(arr);

        String prefix = "";
        char check = '1';
        label: for(int j=0; j<min.length(); j++){

            check = arr[0].charAt(j);
            for(int i=1; i<arr.length; i++){
                if(check != arr[i].charAt(j)) break label;
            }
            prefix = prefix + check;

        }

        if(prefix.equals("")) return "-1";
        else return prefix;

    }

    private static String findMin(String[] arr){

        String min = arr[0];
        for(int i=1; i< arr.length; i++){
            if(min.length() > arr[i].length())
                min = arr[i];
        }
        return min;

    }



    private static void printArray(int[] arr){
        for(int i: arr) System.out.print(i + " ");
    }

}