package java_string.Level1;
import java.util.*;
public class q6 {
    static void genEx(String s) {
        System.out.println(s.substring(5, 2));
    }

    static void handleEx(String s) {
        try {
            System.out.println(s.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        try {
            genEx(s);
        } catch (Exception e) {}
        handleEx(s);
    }
}
