package org.example.builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new UsualComputer());
        Computer computer = director.buildComputer();
        System.out.println(computer);
    }
}
