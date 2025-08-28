package ProgrammingElementsLevel1;
import java.util.*;
public class TriangleArea {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

	        System.out.print("Enter base (in inches): ");
	        double base = sc.nextDouble();

	        System.out.print("Enter height (in inches): ");
	        double height = sc.nextDouble();

	        double areaInInches = 0.5 * base * height;
	        double areaInCm = areaInInches * 6.4516; // 1 sq inch = 6.4516 sq cm

	        System.out.println("The area of triangle is " + areaInInches + " square inches and " + areaInCm + " square centimeters.");

	}

}
