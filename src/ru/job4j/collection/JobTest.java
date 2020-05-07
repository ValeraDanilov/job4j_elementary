package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(new Job("Impl task", 0), new Job("Fix bug", 1));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorNameAndDescending() {
        Comparator<Job> name = new JobDescByName();
        int rsl = name.compare(new Job("A", 3), new Job("C", 1));
        assertThat(rsl, is(2));
    }

    @Test
    public void whenCompatorNameAndAscending() {
        Comparator<Job> name = new SortByNameAscending();
        int rsl = name.compare(new Job("A", 1), new Job("B", 2));
        assertThat(rsl, is(-1));
    }

    @Test
    public void whenCompatorPriorityAndDescending() {
        Comparator<Job> name = new JobDescByPriority();
        int rsl = name.compare(new Job("C", 3), new Job("B", 2));
        assertThat(rsl, is(-1));
    }
    @Test
    public void whenCompatorPriorityAndAscending() {
        Comparator<Job> name = new SortByPriorityAscending();
        int rsl = name.compare(new Job("C", 3), new Job("A", 1));
        assertThat(rsl, is(1));
    }
    @Test
    public void whenCompatorByProrityAndName() {
        Comparator<Job> cmpPriorityName = new SortByPriorityAscending().thenComparing(new SortByNameAscending());
        int rsl = cmpPriorityName.compare(new Job("Impl task", 0), new Job("Fix bug", 1));
        assertThat(rsl, is(-1));
    }
}