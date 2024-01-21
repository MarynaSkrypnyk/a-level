package org.example.strategy;

public class BusRouteStrategy implements RouteStrategy {
   private String bus = "bus";
    @Override
    public String calculateRoute(String destination) {
        return "if you use " + bus +" you spend on travel 72 hours";
    }
    @Override
    public String toString() {
        return calculateRoute(bus);
    }
}
