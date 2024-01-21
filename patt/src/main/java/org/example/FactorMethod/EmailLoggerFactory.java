package org.example.FactorMethod;

public class EmailLoggerFactory implements LoggerFactory{

    @Override
    public Logger createLogger() {
        return new EmailLogger();
    }
}
