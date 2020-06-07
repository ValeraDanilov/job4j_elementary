package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        double height = 175;
        double weight = 86.25;
        double result = Fit.manWeight(height);
        Assert.assertEquals(weight, result, 0.01);
    }
    @Test
    public void womanWeight() {
        double height = 170;
        double weight = 69.0;
        double result = Fit.womanWeight(height);
        Assert.assertEquals(weight, result, 0.01);
    }
}
