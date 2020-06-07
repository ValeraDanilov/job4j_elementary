package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int number = word.length - 1;
        for (int index = post.length - 1; index >= 0 ; index--) {
            if (post[index] != word[number]) {
                result = false;
                break;
            }
             number --;
        }
        return result;
    }
}