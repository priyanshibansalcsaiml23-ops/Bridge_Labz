package ControlFlows;
import java.util.Scanner;
public class Level2_q1 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        if (number > 0) {
	            for (int i = 1; i <= number; i++) {
	                if (i % 2 == 0)
	                    System.out.println(i + " is Even");
	                else
	                    System.out.println(i + " is Odd");
	            }
	        } else {
	            System.out.println("Not a natural number!");
	        }
	    }
	}


