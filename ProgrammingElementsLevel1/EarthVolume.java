package ProgrammingElementsLevel1;
import java.util.*;
public class EarthVolume {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter radius of Earth in km: ");
        double radiusKm = input.nextDouble();

        double pi = Math.PI;
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // convert to miles
        double radiusMiles = radiusKm * 0.621371;
        double volumeMiles3 = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
                           " and cubic miles is " + volumeMiles3);
	}

}
