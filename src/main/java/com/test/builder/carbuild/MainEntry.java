package com.test.builder.carbuild;

import java.util.Random;

public class MainEntry {

    public static void main(String[] args) {

        Car car1 = new Car("V8", true, "black", true, false);
        CarBuilder carBuilder = new CarBuilder()
                .setEngine("V10")
                .setAirbag(true)
                .setColor("white");

        Random random = new Random();
        Car car2 = carBuilder
                .setAEB(random.nextInt(2) == 0)
                .setCameraSensor(random.nextInt(3) == 0)
                .build();

        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
}
