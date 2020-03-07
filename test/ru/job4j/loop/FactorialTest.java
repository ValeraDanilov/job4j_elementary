package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int number = 5;
        int result = 120;
        int out = Factorial.calc(number);
        assertThat(out, is(result));
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int number = 0;
        int result = 1;
        int out = Factorial.calc(number);
        assertThat(out, is(result));
        //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
    }
}