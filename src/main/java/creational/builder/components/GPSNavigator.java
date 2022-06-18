package creational.builder.components;

public class GPSNavigator {
    private final String route;

    public GPSNavigator() {
        this.route = "2892 Cooper Rd Wadley, Georgia(GA), 30477";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
