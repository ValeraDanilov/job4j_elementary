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

        perimeter = 6;
        ratio = 2;
        result = 2.0;
        out = SqArea.square(perimeter, ratio);
        Assert.assertEquals(result, out, 0.01);
    }
}
