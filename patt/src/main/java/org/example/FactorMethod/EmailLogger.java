package org.example.FactorMethod;

public class EmailLogger implements Logger{
    @Override
    public void createLogger() {
        System.out.println("Create logger in EmailLogger");
    }
}
