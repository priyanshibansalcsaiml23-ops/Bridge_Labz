package ControlFlows;
import java.util.Scanner;
public class Level1_q14 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a positive integer: ");
	        int n = sc.nextInt();

	        if (n < 0) {
	            System.out.println("Factorial is not defined for negative numbers.");
	        } else {
	            long fact = 1;
	            int i = 1;
	            while (i <= n) {
	                fact *= i;
	                i++;
	            }
	            System.out.println("Factorial of " + n + " is " + fact);
	        }
	    }
	}


