package Level1;
import java.util.*;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), fact = 1;
        if(n >= 0) {
            int i = 1;
            while(i <= n) fact *= i++;
            System.out.println("Factorial: " + fact);
        } else System.out.println("Invalid input");
    }
}
