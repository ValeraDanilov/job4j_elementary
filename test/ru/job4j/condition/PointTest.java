package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        int one = 0;
        int two = 0;
        int three = 2;
        int four = 0;
        double result = 2.0;
        double out = Point.distance(one,two,three,four);
        Assert.assertEquals(result, out, 0.01);
        one = 4;
        two = 2;
        three = -3;
        four = 0;
        result = 7.280109889280518;
        out = Point.distance(one,two,three,four);
        Assert.assertEquals(result, out, 0.01);
    }
}
