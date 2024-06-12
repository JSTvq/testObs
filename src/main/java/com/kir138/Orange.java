package com.kir138;

public class Orange extends Fruit {

    public Orange(float weight) {
        super(1.5f);
    }

    @Override
    public String toString() {
        return "Orange{" +
                "weight=" + weight +
                '}';
    }
}
