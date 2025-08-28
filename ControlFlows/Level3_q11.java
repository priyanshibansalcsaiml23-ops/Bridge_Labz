package ControlFlows;
import java.util.Scanner;
public class Level3_q11 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input date
	        System.out.print("Enter month (1=Jan, 2=Feb, ... 12=Dec): ");
	        int m = sc.nextInt();

	        System.out.print("Enter day: ");
	        int d = sc.nextInt();

	        System.out.print("Enter year: ");
	        int y = sc.nextInt();

	        // Formula adjustments
	        int y0 = y - (14 - m) / 12;
	        int x = y0 + y0/4 - y0/100 + y0/400;
	        int m0 = m + 12 * ((14 - m) / 12) - 2;
	        int d0 = (d + x + (31*m0)/12) % 7;

	        // Output result
	        System.out.println("Day of week (0=Sunday, 1=Monday, ..., 6=Saturday): " + d0);
	    }
	}


