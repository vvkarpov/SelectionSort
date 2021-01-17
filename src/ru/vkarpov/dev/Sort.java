package ru.vkarpov.dev;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {

        int[] array = new int[] {4, 2, 5, 3, 1, 6};
        System.out.println(Arrays.toString(array));
        int[] sortArray = sort(array);
        System.out.println(Arrays.toString(sortArray));
    }

    public static int[] sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minIndex = i;
            int tmp = array[i];
            for (int j = i; j < array.length; j++) {
                if (min > array[j]){
                    min = array[j];
                    minIndex = j;
                }
            }
            array[i] = min;
            array[minIndex] = tmp;
        }
        return array;
    }



}
