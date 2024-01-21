package org.example.strategy;

public class CarRouteStrategy implements RouteStrategy{
    public String car = "car";
    @Override
    public String calculateRoute(String destination) {
        return "if use "+ car + " you spend on travel 66 hours";
    }
    public String toString() {
        return calculateRoute(car);
    }
}
