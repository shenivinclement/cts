package org.example;

public class Engine {

    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println(type + " engine started!");
    }
}