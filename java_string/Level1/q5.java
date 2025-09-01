package java_string.Level1;
import java.util.Scanner;
public class q5 {
    static void genEx(String s) {
        System.out.println(s.charAt(s.length()));
    }

    static void handleEx(String s) {
        try {
            System.out.println(s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // genEx(s); // Uncomment to see abrupt stop
        handleEx(s);
    }
}
