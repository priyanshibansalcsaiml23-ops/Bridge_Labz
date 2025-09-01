package java_string.Level2;

import java.util.*;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] ages = genAges(n);
        String[][] res = checkVote(ages);
        display(res);
    }

    static int[] genAges(int n) {
        Random r = new Random();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = r.nextInt(90) + 10; // generates 2-digit age (10–99)
        return a;
    }

    static String[][] checkVote(int[] a) {
        String[][] r = new String[a.length][2];
        for (int i = 0; i < a.length; i++) {
            r[i][0] = String.valueOf(a[i]);
            if (a[i] < 0) r[i][1] = "false";
            else r[i][1] = a[i] >= 18 ? "true" : "false";
        }
        return r;
    }

    static void display(String[][] a) {
        System.out.println("Age\tCan Vote");
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i][0] + "\t" + a[i][1]);
    }
}

