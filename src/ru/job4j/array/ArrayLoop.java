package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {

        int[] number = new int[5];

        for (int index = 0; index < number.length; index++) {
            number[index] = index * 2 + 3;
        }
        for (int sum: number){
            System.out.println(sum);
        }
    }
}
