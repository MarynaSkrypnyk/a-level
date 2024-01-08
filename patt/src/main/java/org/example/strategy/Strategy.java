package org.example.strategy;

public class Strategy {
    RouteStrategy routeStrategy;
    public Strategy (RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }
    public String calculateRoute(String destination){
        return routeStrategy.calculateRoute(destination);
    }
}
