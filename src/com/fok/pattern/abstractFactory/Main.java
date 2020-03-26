package com.fok.pattern.abstractFactory;

/**
 * Abstract Factory is the creation design Pattern.
 * Factory to create other factories.
 * (Фабрика фабрик)
 */
public class Main {
    public static void main(String[] args) {
        CarsFactory carsFactory = new ToyotaFactory();
        //create toyota coupe
        ToyotaCoupe toyotaCoupe = (ToyotaCoupe) carsFactory.createCoupe();
        //create toyota sedan
        ToyotaSedan toyotaSedan = (ToyotaSedan) carsFactory.createSedan();
        //change to ford factory
        carsFactory = new FordFactory();
        //create ford coupe
        FordCoupe fordCoupe = (FordCoupe) carsFactory.createCoupe();
        //create ford sedan
        FordSedan fordSedan = (FordSedan) carsFactory.createSedan();
    }
}
