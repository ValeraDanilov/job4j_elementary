package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        int count = 0;
        for (int index = 2; index <= number; index++){
            if (number % index == 0){
                count++;
            }
        }
        return count == 1? true: false;
    }
}
