package java_string.Level1;
import java.util.Scanner;
public class q8 {
    static void genEx(String[] arr) {
        System.out.println(arr[arr.length]);
    }

    static void handleEx(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = sc.next();
        // This will throw and stop the program
        // genEx(arr);
        // This will handle the exception
        handleEx(arr);
    }
}
