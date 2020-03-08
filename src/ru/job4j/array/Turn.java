package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int number = array.length / 2;
        for (int index = 0; index < number; index++) {
            int temp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;
        }
        return array;
    }
}
