package ProgrammingElementsLevel1;
import java.util.*;
public class PenDivisions {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter total pens: ");
	        int pens = sc.nextInt();
	        System.out.print("Enter number of students: ");
	        int students = sc.nextInt();

	        int pensPerStudent = pens / students;
	        int remainingPens = pens % students;
	        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
	}

}
