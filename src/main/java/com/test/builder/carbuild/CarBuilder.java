package com.test.builder.carbuild;

public class CarBuilder {
    private String engine;
    private boolean airbag;
    private String color;
    private boolean cameraSensor;
    private boolean AEB;

    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setAirbag(boolean airbag) {
        this.airbag = airbag;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setCameraSensor(boolean cameraSensor) {
        this.cameraSensor = cameraSensor;
        return this;
    }

    public CarBuilder setAEB(Boolean AEB) {
        this.AEB = AEB;
        return this;
    }
    public Car build() {
        return new Car(this.engine, this.airbag, this.color, this.cameraSensor, this.AEB);
    }
}
