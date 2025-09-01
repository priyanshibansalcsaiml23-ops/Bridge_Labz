package java_string.Level2;

import java.util.*;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[][] res = classify(s);
        display(res);
    }

    static String check(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    static String[][] classify(String s) {
        String[][] r = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            r[i][0] = String.valueOf(s.charAt(i));
            r[i][1] = check(s.charAt(i));
        }
        return r;
    }

    static void display(String[][] a) {
        System.out.println("Char\tType");
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i][0] + "\t" + a[i][1]);
    }
}
