package com.github.tel_ran_de.task_2110.task1;

public class Test1 {


    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        for(int i =0; i< 5; i++) {
            arr[i] = 7;
            sum += 7;
        }
        for(int i =5; i< arr.length; i++) {
            arr[i] = sum;
        }
        for(int value: arr) {
            System.out.println(value);
        }
    }



}
