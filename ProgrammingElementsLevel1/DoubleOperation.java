package ProgrammingElementsLevel1;
import java.util.*;
public class DoubleOperation {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

	        System.out.print("Enter double a: ");
	        double a = sc.nextDouble();

	        System.out.print("Enter double b: ");
	        double b = sc.nextDouble();

	        System.out.print("Enter double c: ");
	        double c = sc.nextDouble();

	        double result1 = a + b * c;
	        double result2 = a * b + c;
	        double result3 = c + a / b;
	        double result4 = a % b + c;  // modulus also works for doubles in Java

	        System.out.println("The results of Double Operations are " +
	                           result1 + ", " + result2 + ", " + result3 + ", and " + result4);

	}

}
