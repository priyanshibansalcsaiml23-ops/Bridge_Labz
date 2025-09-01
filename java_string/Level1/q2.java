package java_string.Level1;
import java.util.Scanner;



public class q2 {
    static String substringWithCharAt(String s, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) sb.append(s.charAt(i));
        return sb.toString();
    }

    static boolean compareWithCharAt(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String sub1 = substringWithCharAt(s, start, end);
        String sub2 = s.substring(start, end);
        boolean res = compareWithCharAt(sub1, sub2);
        System.out.println("Substring with charAt: " + sub1);
        System.out.println("Substring with substring(): " + sub2);
        System.out.println("Are equal: " + res);
    }
}
