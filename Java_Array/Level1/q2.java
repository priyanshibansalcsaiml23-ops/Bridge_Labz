import java.util.Scanner;

public class S {
    static String sub(String s, int a, int b) {
        String r = "";
        for (int i = a; i < b; i++) r += s.charAt(i);
        return r;
    }

    static boolean cmp(String x, String y) {
        if (x.length() != y.length()) return false;
        for (int i = 0; i < x.length(); i++)
            if (x.charAt(i) != y.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = sc.nextInt(), b = sc.nextInt();
        String m = sub(s, a, b), n = s.substring(a, b);
        System.out.println("Manual: " + m);
        System.out.println("Built-in: " + n);
        System.out.println("Equal: " + cmp(m, n));
    }
}
