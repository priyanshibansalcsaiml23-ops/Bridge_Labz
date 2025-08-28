

package java_array.Level2;
import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Part 1: Store marks in 2D array and compute percentage and grade
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        String[] subjects = {"Physics", "Chemistry", "Maths"};
        double[] percentages = new double[n];
        char[] grades = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            int total = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + ": ");
                marks[i][j] = sc.nextInt();
                total += marks[i][j];
            }
            percentages[i] = total / 3.0;
            if (percentages[i] >= 90) grades[i] = 'A';
            else if (percentages[i] >= 80) grades[i] = 'B';
            else if (percentages[i] >= 70) grades[i] = 'C';
            else if (percentages[i] >= 60) grades[i] = 'D';
            else grades[i] = 'F';
        }

        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d: Percentage = %.2f, Grade = %c\n", i + 1, percentages[i], grades[i]);
        }

        // Part 2: Frequency of each digit in a number
        System.out.print("\nEnter a number: ");
        long num = sc.nextLong();
        int[] freq = new int[10];
        long temp = Math.abs(num);
        if (temp == 0) freq[0] = 1;
        while (temp > 0) {
            freq[(int)(temp % 10)]++;
            temp /= 10;
        }
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0)
                System.out.println("Digit " + i + ": " + freq[i]);
        }
        sc.close();
    }
}


