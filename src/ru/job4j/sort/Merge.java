package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int index = 0, leftIndex = 0, rightIndex = 0;


        while (rsl.length > index) {
            if (leftIndex >= left.length) {
                rsl[index] = right[rightIndex];
                rightIndex ++;
            } else if (rightIndex >= right.length) {
                rsl[index] = left[leftIndex];
                leftIndex ++;
            } else if (left[leftIndex] < right[rightIndex]) {
                rsl[index] = left[leftIndex];
                leftIndex ++;
            } else {
                rsl[index] = right[rightIndex];
                rightIndex ++;
            }
            index ++;
        }


        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(new int[] {1, 3, 5}, new int[] {2, 4});
        System.out.println(Arrays.toString(rsl));
    }
}
