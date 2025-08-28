package ControlFlows;
import java.util.Scanner;
public class Level3_q3 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter marks in Physics: ");
	        int physics = sc.nextInt();
	        System.out.print("Enter marks in Chemistry: ");
	        int chemistry = sc.nextInt();
	        System.out.print("Enter marks in Maths: ");
	        int maths = sc.nextInt();

	        double average = (physics + chemistry + maths) / 3.0;
	        String grade, remarks;

	        if (average >= 90) {
	            grade = "A";
	            remarks = "Excellent";
	        } else if (average >= 75) {
	            grade = "B";
	            remarks = "Very Good";
	        } else if (average >= 60) {
	            grade = "C";
	            remarks = "Good";
	        } else if (average >= 40) {
	            grade = "D";
	            remarks = "Pass";
	        } else {
	            grade = "F";
	            remarks = "Fail – Needs Improvement";
	        }

	        System.out.println("Average Marks: " + average);
	        System.out.println("Grade: " + grade);
	        System.out.println("Remarks: " + remarks);
	    }
	}

