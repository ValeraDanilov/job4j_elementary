package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> map = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!map.containsKey(citizen.getPassport())) {
            map.put(citizen.getPassport(), citizen);
            rsl = true;
        }
        return rsl;
    }
    public Citizen get(String passport) {
      return map.get(passport);

    }
}
