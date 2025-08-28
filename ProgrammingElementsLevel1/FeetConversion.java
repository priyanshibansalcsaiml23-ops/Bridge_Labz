package ProgrammingElementsLevel1;
import java.util.*;
public class FeetConversion {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

	        System.out.print("Enter distance in feet: ");
	        double feet = sc.nextDouble();

	        double yards = feet / 3.0;
	        double miles = yards / 1760.0;

	        System.out.println("The distance is " + feet + " feet, which is " + yards + " yards and " + miles + " miles.");

	}

}
