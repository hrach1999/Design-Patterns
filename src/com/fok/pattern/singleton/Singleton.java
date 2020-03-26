package com.fok.pattern.singleton;

/**
 * Singleton is the creation design pattern.
 *
 * There is recommendation to set Singleton class final for don't inheriting from Singleton class.
 * Each started JVM created it's own instance of Singleton class.
 * Each class loader can create own instance of Singleton class when the initializing is doing by class loader(not lazy implementation).
 *
 * There are several problems according to Cloneable and Serializable implementations.
 *
 * This implementation is great for application that have only one execution thread.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}

/**
 * This implementation is great for multithreading application.
 * There are 2 problems we loose lazy initialization and we can't handle exception in object constructor.
 */
class Singleton1 {
    private static Singleton1 instance = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return instance;
    }
}

/**
 * This implementation is great for multithreading application and we have lazy initialization.
 * Disadvantage  of this approach is that we can't handle exception in constructor code.
 * So if out constructor don't execute danger code(that can be throw exception so we can use this approach)
 */
class Singleton2 {
    private Singleton2() {
    }

    private static class SingletonHolder {
        private final static Singleton2 instance = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return SingletonHolder.instance;
    }
}

/**
 * This implementation is the best,it's lazy, it's thread safe and it's can handle 'danger code' in constructor.
 * Minus of this approach is that the method is synchronized and it come in handy for the first time call to initialize the instance and for others times it use extra time.
 * If our application not much call getInstance() method we can use this approach.
 */
class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {
    }

    public static synchronized Singleton3 getInstance() {
        if (instance == null)
            instance = new Singleton3();
        return instance;
    }
}

/**
 * Double-Checked Locking approach.
 * It can other implementation with volatile variable.
 * But they don't recommend use approach of volatile because in the processor that have multithreading we get performance problem.
 */
class Singleton4 {
    private static Singleton4 instance;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null)
                    instance = new Singleton4();
            }
        }
        return instance;
    }
}
