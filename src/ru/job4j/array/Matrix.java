package ru.job4j.array;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];

        for (int index = 0; index < table.length; index++) {
            for (int count = 0; count < table[index].length; count++) {
                table[index][count] = (index + 1) * (count + 1);
            }
        }
        return table;
    }
}
