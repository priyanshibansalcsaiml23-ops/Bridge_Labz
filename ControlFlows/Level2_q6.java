package ControlFlows;
import java.util.Scanner;
public class Level2_q6 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Ages
	        System.out.print("Enter Amar's age: ");
	        int amarAge = sc.nextInt();
	        System.out.print("Enter Akbar's age: ");
	        int akbarAge = sc.nextInt();
	        System.out.print("Enter Anthony's age: ");
	        int anthonyAge = sc.nextInt();

	        // Heights
	        System.out.print("Enter Amar's height: ");
	        int amarHeight = sc.nextInt();
	        System.out.print("Enter Akbar's height: ");
	        int akbarHeight = sc.nextInt();
	        System.out.print("Enter Anthony's height: ");
	        int anthonyHeight = sc.nextInt();

	        // Youngest
	        if (amarAge < akbarAge && amarAge < anthonyAge)
	            System.out.println("Youngest: Amar");
	        else if (akbarAge < amarAge && akbarAge < anthonyAge)
	            System.out.println("Youngest: Akbar");
	        else
	            System.out.println("Youngest: Anthony");

	        // Tallest
	        if (amarHeight > akbarHeight && amarHeight > anthonyHeight)
	            System.out.println("Tallest: Amar");
	        else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight)
	            System.out.println("Tallest: Akbar");
	        else
	            System.out.println("Tallest: Anthony");
	    }
	}

