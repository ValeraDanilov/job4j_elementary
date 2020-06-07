package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square() {
        int perimeter = 4;
        int ratio = 1;
        double result = 1.0;
        double out = SqArea.square(perimeter, ratio);
        Assert.assertEquals(result, out, 0.01);
    }
        @Test
        public void squareOne() {
        int perimeter = 6;
        int ratio = 2;
        double result = 2.0;
        double out = SqArea.square(perimeter, ratio);
        Assert.assertEquals(result, out, 0.01);
    }
}
