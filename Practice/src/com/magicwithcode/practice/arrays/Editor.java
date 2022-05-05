package com.magicwithcode.practice.arrays;

class Editor{

    public static void main(String[] args) {

        int[] arr = {1,6,7,8,9,9};

        int result = firstRepeated(arr);
        System.out.println(result);


    }

    private static int firstRepeated(int[] arr) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        printArray(arr);
        System.out.println();

        int[] temp = new int[max + 1];

        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            temp[num]++;
        }
        printArray(temp);
        System.out.println();

        for(int i=0; i<arr.length;i++){
            int num = arr[i];
            System.out.println("Num: "+num+" ; temp["+num+"]: "+temp[num]);
            if(temp[num]>1){
                return i;
            }
        }

        return -1;
    }

    private static void printArray(int[] arr){
        for(int i: arr) System.out.print(i + " ");
    }

}