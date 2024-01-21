package org.example.FactorMethod;

public class DataBaseFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        return new DataBaseLogger();
    }
}
