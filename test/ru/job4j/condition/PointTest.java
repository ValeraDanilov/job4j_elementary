package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distanceOne() {
        int one = 0;
        int two = 0;
        int three = 2;
        int four = 0;
        double result = 2.0;
        double out = Point.distance(one, two, three, four);
        Assert.assertEquals(result, out, 0.01);
    }
    @Test
    public void distanceTwo() {
        int one = 4;
        int two = 2;
        int three = -3;
        int four = 0;
        double result = 7.280109889280518;
        double out = Point.distance(one,two,three,four);
        Assert.assertEquals(result, out, 0.01);
    }
}
