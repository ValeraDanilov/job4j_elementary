package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        PriorityQueue priority = new PriorityQueue();
        priority.put(new Task("low", 5));
        priority.put(new Task("urgent", 1));
        priority.put(new Task("middle", 3));
        var result = priority.take();
        assertThat(result.getDesc(), is("low"));
    }
}
