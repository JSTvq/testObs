package com.kir138;

public class Apple extends Fruit {

    public Apple(float weight) {
        super(1.0f);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                '}';
    }
}
