

package java_string.Level2;
import java.util.Scanner;
public class q1 {
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string reached
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        int customLength = getStringLength(input);
        int builtInLength = input.length();
        System.out.println("Length (without using length()): " + customLength);
        System.out.println("Length (using length()): " + builtInLength);
        sc.close();
    }
}
