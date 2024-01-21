package org.example.FactorMethod;

public class FileLogger implements Logger{
    @Override
    public void log() {
    }
    @Override
    public void write() {
        System.out.println("FileLogger create");
    }
}
