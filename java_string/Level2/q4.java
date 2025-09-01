package java_string.Level2;

import java.util.*;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) return;
        int[] o = new int[n / 2 + 1], e = new int[n / 2 + 1];
        int oi = 0, ei = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) e[ei++] = i;
            else o[oi++] = i;
        }
        for (int i = 0; i < oi; i++) System.out.print(o[i] + " ");
        System.out.println();
        for (int i = 0; i < ei; i++) System.out.print(e[i] + " ");
    }
}
