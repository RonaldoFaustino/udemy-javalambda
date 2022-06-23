package com.udemy.java.datatype;

import java.util.Arrays;

public class AvoidingMutation {

    public static void main(String[] args) {

        //abc123
        int[] arr = new int[] {1,2,3};

        predict(arr);
        totalSale(arr);
    }
    //abc123
    private static void predict(int[] a){
        //def23
        a = Arrays.copyOf(a, a.length);
        a[0]++;
        a[1]++;
        System.out.println("Predict for next month :: " + (a[0] + a[1] + a[2]));
    }

    private static void totalSale(int[] a){
        int result = (a[0] + a[1] + a[2]);
        System.out.println("Total Sale dor this Month :: " + result);
    }
}
