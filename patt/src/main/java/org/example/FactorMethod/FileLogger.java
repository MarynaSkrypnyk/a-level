package org.example.FactorMethod;

public class FileLogger implements Logger{
    @Override
    public void createLogger() {
        System.out.println("Create logger in FileLogger");
    }
}
