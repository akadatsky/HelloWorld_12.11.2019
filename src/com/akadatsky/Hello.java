package com.akadatsky;

import java.util.Arrays;

public class Hello {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        changeArray(arr);
        System.out.println("еще раз в main arr: " + Arrays.toString(arr));
        test();
    }

    private static void test() {
        System.out.println("TEST");
    }

    private static void changeArray(int[] arr) {
        arr[0] = 55;
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        arr = arr2;
        System.out.println("Новый массив: " + Arrays.toString(arr));
        System.out.println(arr);
    }

    private static void test2() {
        System.out.println("test2");
    }


}

