package com.oopsconcept;

public class RunTest {
    public static void main(String[] args) {
        Dell dell = new Dell();
        dell.Colour();

        MacBook macBook = new MacBook();
        macBook.BatteryLife();

        Lenovo lenovo = new Lenovo();
        lenovo.OperatingSystem();

        Mobile mobile = new Mobile();
        mobile.ColourOfDevice();
    }
}
