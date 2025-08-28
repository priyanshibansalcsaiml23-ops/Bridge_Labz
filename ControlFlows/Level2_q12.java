package ControlFlows;
import java.util.Scanner;
public class Level2_q12 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter base number: ");
	        int number = sc.nextInt();
	        System.out.print("Enter power: ");
	        int power = sc.nextInt();

	        if (power >= 0) {
	            long result = 1;
	            for (int i = 1; i <= power; i++) {
	                result *= number;
	            }
	            System.out.println(number + " ^ " + power + " = " + result);
	        } else {
	            System.out.println("Power must be non-negative!");
	        }
	    }
	}

