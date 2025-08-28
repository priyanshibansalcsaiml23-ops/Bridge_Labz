package ProgrammingElementsLevel1;
import java.util.*;
public class ProfitPercentage {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Cost Price (INR): ");
	        int costPrice = sc.nextInt();
	        System.out.print("Enter Selling Price (INR): ");
	        int sellingPrice = sc.nextInt();

	        int profit = sellingPrice - costPrice;
	        double profitPercent = (profit * 100.0) / costPrice;

	        System.out.println(
	            "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
	            "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercent
	        );
	}

}
