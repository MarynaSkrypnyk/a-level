package org.example.strategy;

public class Main {
    public static void main(String[] args) {
        Navigator strategy = new Navigator();
        strategy.calculateRoute("Автобус","Lviv");
        System.out.println(strategy);

    }
}