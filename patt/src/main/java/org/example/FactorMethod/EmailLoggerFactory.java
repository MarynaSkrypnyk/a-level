package org.example.FactorMethod;

public class EmailLoggerFactory implements LoggerFactory{
    @Override
    public Logger writeLogger() {
        return new EmailLogger();
    }
}
