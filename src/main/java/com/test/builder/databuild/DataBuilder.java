package com.test.builder.databuild;

public abstract class DataBuilder {

    protected Data data;

    public DataBuilder(Data data) {
        this.data = data;
    }

    public abstract String head();
    public abstract String body();
    public abstract String foot();

}
