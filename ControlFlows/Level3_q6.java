package ControlFlows;
import java.util.Scanner;
public class Level3_q6 {
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        int count = 0;
	        int temp = number;

	        while (temp != 0) {
	            temp /= 10;
	            count++;
	        }

	        System.out.println("Number of digits in " + number + " = " + count);
	    }
	}

