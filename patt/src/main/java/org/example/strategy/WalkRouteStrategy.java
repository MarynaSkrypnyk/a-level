package org.example.strategy;

public class WalkRouteStrategy implements RouteStrategy{
    @Override
    public String calculateRoute(String destination) {
        return destination= "WalkRoute";
    }
}
