package org.example.strategy;

public class Navigator {
   private RouteStrategy routeStrategy;

    public void setRouteStrategy (RouteStrategy routeStrategy){
       this.routeStrategy = routeStrategy;
   }
    @Override
    public String toString() {
        return routeStrategy.toString();
    }
}
