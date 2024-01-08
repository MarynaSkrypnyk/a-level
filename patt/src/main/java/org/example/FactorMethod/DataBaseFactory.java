package org.example.FactorMethod;

public class DataBaseFactory implements LoggerFactory{
    @Override
    public Logger writeLogger() {
        return new DataBaseLogger() {
        };
    }
}
