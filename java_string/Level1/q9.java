package java_string.Level1;

import java.util.Scanner;

public class q9 {
    static String toUpper(String s) {
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') c = (char)(c - 32);
            r.append(c);
        }
        return r.toString();
    }

    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String upper1 = toUpper(s);
        String upper2 = s.toUpperCase();
        boolean res = compare(upper1, upper2);
        System.out.println("Custom: " + upper1);
        System.out.println("Built-in: " + upper2);
        System.out.println("Equal: " + res);
    }
}
