package org.example.strategy;

public class BusRouteStrategy implements RouteStrategy {
    @Override
    public String calculateRoute(String destination) {
        return destination = "BusRoute";
    }
}
