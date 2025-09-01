package java_string.Level2;
import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a = new String[n];
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) a[i - 1] = "FizzBuzz";
            else if (i % 3 == 0) a[i - 1] = "Fizz";
            else if (i % 5 == 0) a[i - 1] = "Buzz";
            else a[i - 1] = String.valueOf(i);
        }
        for (int i = 0; i < n; i++)
            System.out.println("Position " + (i + 1) + " = " + a[i]);
    }
}
