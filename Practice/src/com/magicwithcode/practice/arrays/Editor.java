package com.magicwithcode.practice.arrays;


public class Editor {


    public static void main(String[] args) {

        int[] arr = {12, 11, 40, 12, 5, 6, 5, 12, 11};

        sortArray(arr);

    }

    private static void sortArray(int[] arr) {

        int temp;
        label: for(int i=0; i<arr.length; i++){

            for(int j=i+1; j< arr.length; j++){

                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                printArray(arr);
                System.out.println();
            }
            System.out.println("Iteration: "+i);

        }


    }

    private static void printArray(int[] arr) {
        for(int i: arr) System.out.print(i + " ");
    }


}
