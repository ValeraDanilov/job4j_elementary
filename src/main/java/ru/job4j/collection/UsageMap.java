package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Vasya@gmail.com", "Pupkin Vasya Ivanovich");
        for (Map.Entry<String, String> element: map.entrySet()) {
            String key = element.getKey();
            String value = element.getValue();

            System.out.println(key + " | " + value);
        }
    }
}
