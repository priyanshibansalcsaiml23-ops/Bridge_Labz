package q3_vehiclerental;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle c = new Car("CAR-001", 1200);
        Vehicle b = new Bike("BIKE-101", 300);
        Vehicle t = new Truck("TRK-900", 2500);

        VehicleService svc = new VehicleService();
        svc.printRentalAndInsurance(c, 3);
        System.out.println();
        svc.printRentalAndInsurance(b, 5);
        System.out.println();
        svc.printRentalAndInsurance(t, 2);
    }
}
