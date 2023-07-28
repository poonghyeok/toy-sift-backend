package com.test.builder.databuild;

public class MainEntry {
    public static void main(String[] args) {
        Data data = new Data("dilan", 27);

        DataBuilder dataBuilder = new PlainTextBuilder(data);
        Director director = new Director(dataBuilder);
        String plainTxt = director.build();
        System.out.println(plainTxt);

        dataBuilder = new JsonBuilder(data);
        director = new Director(dataBuilder);
        String json = director.build();
        System.out.println(json);

        dataBuilder = new XmlBuilder(data);
        director = new Director(dataBuilder);
        String xml = director.build();
        System.out.println(xml);
    }
}
