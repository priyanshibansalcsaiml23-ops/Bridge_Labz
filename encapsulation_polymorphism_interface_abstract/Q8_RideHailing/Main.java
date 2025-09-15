package q8_ridehailing;

public class RideMain {
    public static void main(String[] args) {
        Vehicle car = new Car("CAR-11", "Ramesh", 12.5);
        Vehicle bike = new Bike("BIKE-44", "Sita", 6.0);

        RideService svc = new RideService();
        svc.printFare(car, 10);
        System.out.println();
        svc.printFare(bike, 8);
    }
}
