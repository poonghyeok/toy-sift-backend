package com.test.builder.databuild;

public class Director {
    private DataBuilder dataBuilder;

    public Director(DataBuilder dataBuilder) {
        this.dataBuilder = dataBuilder;
    }

    public String build() {
        StringBuilder sb = new StringBuilder();

        sb.append(dataBuilder.head());
        sb.append(dataBuilder.body());
        sb.append(dataBuilder.foot());

        return sb.toString();
    }
}
