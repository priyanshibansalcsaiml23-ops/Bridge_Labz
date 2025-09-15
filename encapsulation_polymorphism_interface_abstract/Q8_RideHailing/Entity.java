package q8_ridehailing;

public abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Driver: " + driverName + " Vehicle: " + vehicleId + " Rate/km: " + ratePerKm);
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

class Car extends Vehicle implements GPS {
    private String location = "Unknown";
    public Car(String vehicleId, String driverName, double ratePerKm) { super(vehicleId, driverName, ratePerKm); }
    @Override public double calculateFare(double distance) { return getRatePerKm() * distance; }
    @Override public String getCurrentLocation() { return location; }
    @Override public void updateLocation(String location) { this.location = location; }
}

class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm) { super(vehicleId, driverName, ratePerKm); }
    @Override public double calculateFare(double distance) { return getRatePerKm() * distance; }
}

class Auto extends Vehicle {
    public Auto(String vehicleId, String driverName, double ratePerKm) { super(vehicleId, driverName, ratePerKm); }
    @Override public double calculateFare(double distance) { return getRatePerKm() * distance; }
}
