package java_string.Level2;

import java.util.*;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] p = trim(s);
        String m1 = sub(s, p[0], p[1]);
        String m2 = s.trim();
        boolean eq = cmp(m1, m2);
        System.out.println("Manual Trim: " + m1);
        System.out.println("Built-in Trim: " + m2);
        System.out.println("Equal: " + eq);
    }

    static int[] trim(String s) {
        int st = 0, en = s.length() - 1;
        while (st < s.length() && s.charAt(st) == ' ') st++;
        while (en >= 0 && s.charAt(en) == ' ') en--;
        return new int[]{st, en};
    }

    static String sub(String s, int st, int en) {
        String r = "";
        for (int i = st; i <= en; i++) r += s.charAt(i);
        return r;
    }

    static boolean cmp(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }
}
