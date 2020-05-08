package ru.job4j.collection;

import java.util.Objects;

public class Users implements Comparable<Users> {
    private String name;
    private int age;

    public Users(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Users users) {
        return this.name.compareTo(users.name) == 0?Integer.compare(users.age, this.age): Integer.compare(this.age, users.age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users user = (Users) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
