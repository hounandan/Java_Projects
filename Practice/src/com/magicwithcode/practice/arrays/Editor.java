package com.magicwithcode.practice.arrays;


public class Editor {


    public static void main(String[] args) {

        int[] arr = {2,4,7,8,9,10};

        convertToWave(arr);
        printArray(arr);


    }

    private static void convertToWave(int[] a){

        for(int i = 0; i< a.length; i+=2){

            if(i>0 && a[i-1] > a[i]){
                swapElements(a, i-1, i);
            }

            if(i< a.length-1 && a[i+1] > a[i]){
                swapElements(a, i+1, i);
            }

        }

    }

    private static void swapElements(int[] arr, int first, int last){

        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;

    }

    private static void printArray(int[] arr) {
        for(int i: arr) System.out.print(i + " ");
    }


}
