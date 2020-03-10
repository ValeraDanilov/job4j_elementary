package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int count = 1;
        for (int index = 0; index < array.length; index++) {
            for (int i = 0; i < array[index].length; i++) {
                        array[index][i] = count;
                        count++;
            }
        }

        for (int[] arr: array) {
            for (int arrays: arr){
                System.out.println(arrays);
            }
        }
    }
}
