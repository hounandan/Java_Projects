package com.magicwithcode.practice.arrays;


public class Editor {


    public static void main(String[] args) {

        int[] arr = {1,2,3};

        int result = findPeakElement(arr);
        System.out.println(result);

    }

    private static int findPeakElement(int[] arr){

        if(arr.length == 1) return 0;

        for(int i=0; i<arr.length; i++){

            if(i==0){
                if(arr[i] >= arr[i+1]) return i;
            }

            if(i>0 && i<arr.length-1){
                if(arr[i]>=arr[i+1] && arr[i]>=arr[i-1]) return i;
            }

            if(i==arr.length-1){
                if(arr[i]>=arr[i-1]) return i;
            }

        }
        return -1;
    }

    private static void printArray(int[] arr) {
        for(int i: arr) System.out.print(i + " ");
    }


}
