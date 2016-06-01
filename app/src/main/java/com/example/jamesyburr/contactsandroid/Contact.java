package com.example.jamesyburr.contactsandroid;

/**
 * Created by jamesyburr on 6/1/16.
 */
public class Contact {
    String name;
    String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
