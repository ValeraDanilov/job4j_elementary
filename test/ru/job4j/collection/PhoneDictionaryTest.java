package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> persons = phones.find("Ar");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }
}
