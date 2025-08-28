package ProgrammingElementsLevel1;
import java.util.*;
public class UniversityDiscount {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

	        System.out.print("Enter total course fee (INR): ");
	        double fee = sc.nextDouble();

	        System.out.print("Enter discount percentage: ");
	        double discountPercent = sc.nextDouble();

	        double discount = (fee * discountPercent) / 100.0;
	        double finalFee = fee - discount;

	        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);

	}

}
