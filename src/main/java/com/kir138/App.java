package com.kir138;

public class App {
    public static void main(String[] args) {
        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        appleBox.transferInto(appleBox2);
    }
}
