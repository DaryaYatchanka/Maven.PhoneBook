package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    private Map<String, List<String>> map;


    public PhoneBook(Map<String, List<String>> map) {
        this.map = map;

    }

    public PhoneBook() {
        map = new LinkedHashMap<>();
    }

    public void add(String name, String phoneNumber) {
        List<String> list = new ArrayList<>();
        list.add(phoneNumber);
        this.map.put(name, list);

    }

    public void addAll(String name, String... phoneNumbers) {


        this.map.put(name, Arrays.asList(phoneNumbers));
    }

    public void remove(String name) {
        this.map.remove(name);

    }

    public Boolean hasEntry(String name) {
        if (this.map.containsKey(name)) {
            return true;
        }

        return false;
    }

    public List<String> lookup(String name) {

        return map.get(name);
    }

    public String reverseLookup(String phoneNumber) {

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getValue().contains(phoneNumber)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public List<String> getAllContactNames() {
        List<String> list2 = new ArrayList<>();
        for (Map.Entry<String, List<String>> x : map.entrySet()) {
            list2.add(x.getKey());

        }


        return list2;
    }

    public Map<String, List<String>> getMap() {
        return map;
    }
}
