package java_string.Level1;

public class q10 {
    public static String toLowerCaseManual(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sb.append((c >= 'A' && c <= 'Z') ? (char)(c + 32) : c);
        }
        return sb.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String s = sc.nextLine();
        String m = toLowerCaseManual(s);
        String b = s.toLowerCase();
        boolean eq = compareStrings(m, b);
        System.out.println("Manual lowercase: " + m);
        System.out.println("Built-in lowercase: " + b);
        System.out.println("Are both lowercase strings equal? " + eq);
        sc.close();
    }
}
