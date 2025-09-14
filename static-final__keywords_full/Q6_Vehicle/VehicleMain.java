package q6_vehicle;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle.updateRegistrationFee(150.0);

        Vehicle vehicle1 = new Vehicle("Honest raj", "Sedan", "ABC123");
        Vehicle vehicle2 = new Vehicle("Price danish", "SUV", "XYZ789");

        VehicleService service = new VehicleService();
        service.showVehicle(vehicle1);
        System.out.println();
        service.showVehicle(vehicle2);
    }
}
