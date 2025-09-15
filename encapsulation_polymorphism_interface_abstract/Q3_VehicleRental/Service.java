package q3_vehiclerental;

public class VehicleService {
    public void printRentalAndInsurance(Vehicle vehicle, int days) {
        double cost = vehicle.calculateRentalCost(days);
        System.out.println(vehicle.getType() + " (" + vehicle.getVehicleNumber() + ") rental for " + days + " days: " + cost);
        if (vehicle instanceof Insurable) {
            System.out.println(((Insurable) vehicle).getInsuranceDetails());
        }
    }
}
