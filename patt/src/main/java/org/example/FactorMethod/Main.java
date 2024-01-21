package org.example.FactorMethod;

public class Main {
    public static void main(String[] args) {
        LoggerFactory loggerFactory = creteLoggerBySpecialty("dataBase");
        Logger logger = loggerFactory.createLogger();
        logger.write();
    }

    static LoggerFactory creteLoggerBySpecialty(String specialty){
        if (specialty.equalsIgnoreCase("dataBase")){
            return new DataBaseFactory();
        } else if (specialty.equalsIgnoreCase("email")) {
            return new EmailLoggerFactory();
        }else if (specialty.equalsIgnoreCase("file")) {
            return new FileLoggerFactory();
    }   else {
        throw new RuntimeException(specialty + "in unknown specialty");
        }
    }
}
