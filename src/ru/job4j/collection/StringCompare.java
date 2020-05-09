package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        try {
            for (int index = 0; index < Math.max(left.length(), right.length()); index++) {
                rsl = Integer.compare(left.charAt(index), right.charAt(index));
                if (rsl != 0) {
                    break;
                }
            }
        } catch (StringIndexOutOfBoundsException e) {
                rsl = left.length() > right.length()? 1: -1;
        }
        return rsl;
    }
}