package org.example.FactorMethod;

public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger writeLogger() {
        return new FileLogger();
    }
}
