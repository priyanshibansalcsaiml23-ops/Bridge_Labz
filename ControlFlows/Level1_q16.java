package ControlFlows;
import java.util.Scanner;
public class Level1_q16 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();

	        if (n > 0) {
	            for (int i = 1; i <= n; i++) {
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

