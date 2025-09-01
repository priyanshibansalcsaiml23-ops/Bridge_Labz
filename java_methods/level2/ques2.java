package level2;
import java.util.Scanner;

public class ques2 {
    public static int sumRec(int n) {
        if (n == 0) return 0;
        return n + sumRec(n - 1);
    }
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rec = sumRec(n);
        int formula = sumFormula(n);
        System.out.println("Recursion: " + rec + " Formula: " + formula);
    }
}
