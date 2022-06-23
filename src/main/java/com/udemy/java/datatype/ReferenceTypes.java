package com.udemy.java.datatype;

import java.util.Arrays;

public class ReferenceTypes {

    public static void main(String[] args) {

        //abc123
        int[] arr = new int[] {1,2,3};

        System.out.println("Before:: " + Arrays.toString(arr));
        System.out.println("Change:: " + Arrays.toString(change(arr)));
        System.out.println("After:: " + Arrays.toString(arr));
    }

    private static int[] change(int[] a){

        //def23
        a = new int[] {2,1,3};
        a[0]++;
        a[1]++;
        a[2]++;
        a[2]++;
        return a;
    }
}
