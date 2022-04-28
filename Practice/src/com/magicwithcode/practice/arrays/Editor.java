package com.magicwithcode.practice.arrays;

public class Editor {


    public static void main(String[] args) {

        int[] arr = {2,3,1,2,3};

        findDuplicates(arr);

    }

    private static void findDuplicates(int[] arr) {

        int length = arr.length;

        for(int i=0; i<length; i++){

            arr[arr[i] % length] = arr[arr[i] % length] + length;
            printArray(arr);
            System.out.println();

        }

        System.out.println();

        for(int i=0; i<length; i++){
            if(arr[i] >= length * 2){
                System.out.print(i + " ");
            }
        }

    }

    private static void printArray(int[] arr) {
        for(int i: arr) System.out.print(i + " ");
    }


}
