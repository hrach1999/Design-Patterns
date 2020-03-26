package com.fok.pattern.adapter;

/**
 * Adapter is a structure design pattern.
 * Comparing this pattern with real life we can see that the purpose of the adapter(real life) to be an adapter(programming).
 */
public class Main {
    public static void main(String[] args) {
        USB usb = new CardReader(new MemoryCard());
        usb.connectWithUsbCable();
    }
}
