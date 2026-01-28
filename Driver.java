package com;

public class Driver {
    private int driverId;
    private String driverName;
    private String category;
    private double totalDistance;

    public Driver() {}

    public Driver(int driverId, String driverName, String category, double totalDistance) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.category = category;
        this.totalDistance = totalDistance;
    }

    public int getDriverId() {
        return driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getCategory() {
        return category;
    }

    public double getTotalDistance() {
        return totalDistance;
    }
}
