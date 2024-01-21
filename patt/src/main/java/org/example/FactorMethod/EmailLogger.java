package org.example.FactorMethod;

public class EmailLogger implements Logger{
    @Override
    public void log() {
    }
    @Override
    public void write() {
        System.out.println("EmailLogger create");
    }
}
