package com.fok.pattern.builder;

/**
 * Builder is creational design pattern.
 * When we have class with many fields and many versions of constructors the best way is using this design pattern.
 * In this case our class has 6 fields but can be cases that our class has 20+ fields in this cases this design pattern the best approach.
 */
public class Main {
    public static void main(String[] args) {
        Person person = Person.builder().setName("Hrach").
                setSurname("Papikyan").
                setAge(33).
                build();
        System.out.println(person);
    }
}
