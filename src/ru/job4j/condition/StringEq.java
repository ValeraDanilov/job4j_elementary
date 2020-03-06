package ru.job4j.condition;

public class StringEq {
    public static boolean check(String login) {
        String root = new String("root");
        boolean access = root.equals(login);
        return access;
    }

    public static void main(String[] args) {
        String your = "your_name";
        String name = "root";
        boolean userHasAccess = StringEq.check(your);
        boolean userHasAccessOne = StringEq.check(name);
        System.out.println(userHasAccess);
        System.out.println(userHasAccessOne);
    }
}
