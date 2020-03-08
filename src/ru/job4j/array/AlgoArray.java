package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        boolean sort = false;
        while (!sort){
            sort = true;
            for (int index = 1; index < array.length; index++) {
                if (array[index] < array[index - 1]) {
                    int number = array[index];
                    array[index] = array[index - 1];
                    array[index - 1] = number;
                    sort = false;
                }
            }
        }
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}