package org.example.strategy;
public class Navigator {
    public String calculateRoute(String strategy, String destination) {
        if ("автобус".equalsIgnoreCase(strategy)) {
            return "Maршрут на автобусе до " + destination;
        } else if ("машина".equalsIgnoreCase(strategy)) {
            return "Maршрут на машине до " + destination;
        } else if ("пешком".equalsIgnoreCase(strategy)) {
            return "Maршрут пешком до " + destination;
        } else {
            throw new RuntimeException(strategy + "не підтримувана стратегія");
        }
    }
}
