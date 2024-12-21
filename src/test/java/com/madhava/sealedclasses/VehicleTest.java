package com.madhava.sealedclasses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class VehicleTest {

    @Test
    public void test() {
        Vehicle car = new Car();
        Vehicle bus = new Bus();

        assertInstanceOf(Vehicle.class, car);
        assertInstanceOf(Vehicle.class, bus);
    }
}