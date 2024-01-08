package org.example.strategy;

public class CarRouteStrategy implements RouteStrategy{
    @Override
    public String calculateRoute(String destination) {
        return destination= "CarRoute";
    }
}
