package q8_ridehailing;

public class RideService {
    public void printFare(Vehicle v, double distance) {
        v.getVehicleDetails();
        System.out.println("Fare for " + distance + " km: " + v.calculateFare(distance));
    }
}
