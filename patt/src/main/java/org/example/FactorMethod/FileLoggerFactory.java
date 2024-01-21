package org.example.FactorMethod;

public class FileLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
