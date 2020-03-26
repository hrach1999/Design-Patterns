package com.fok.pattern.decorator;

/**
 * Decorator is the structural design pattern.
 * Used to modify the functionality of an object at runtime.
 * It's use aggregation to provide this kind of functionality.
 * <p>
 * We use inheritance or composition to extend the behavior of an object but this is done at
 * compile time and its applicable to all the instances of the class.
 * We can’t add any new functionality of remove any existing behavior at runtime – this is when Decorator
 * pattern comes into picture.
 */
public class Main {
    public static void main(String[] args) {
        Car sportsCar = new SportCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
