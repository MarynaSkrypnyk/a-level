package org.example.strategy;

public class WalkRouteStrategy implements RouteStrategy{
    public String walk = "walk";
    @Override
    public String calculateRoute(String destination) {
        return "if go "+ walk + " you spend on travel 12 month";
    }
    @Override
    public String toString() {
        return calculateRoute(walk);
    }
}
