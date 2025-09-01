package java_string.Level2;

import java.util.*;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5; // number of students
        int[][] pcm = genScores(n);
        double[][] stats = calcStats(pcm);
        String[] grades = calcGrades(stats);
        display(pcm, stats, grades);
    }

    static int[][] genScores(int n) {
        Random r = new Random();
        int[][] a = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = r.nextInt(90) + 10; // 2-digit score
        return a;
    }

    static double[][] calcStats(int[][] a) {
        double[][] r = new double[a.length][3];
        for (int i = 0; i < a.length; i++) {
            int t = a[i][0] + a[i][1] + a[i][2];
            double avg = t / 3.0;
            double pct = (t / 300.0) * 100;
            r[i][0] = t;
            r[i][1] = Math.round(avg * 100.0) / 100.0;
            r[i][2] = Math.round(pct * 100.0) / 100.0;
        }
        return r;
    }

    static String[] calcGrades(double[][] a) {
        String[] g = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            double p = a[i][2];
            if (p >= 90) g[i] = "A+";
            else if (p >= 80) g[i] = "A";
            else if (p >= 70) g[i] = "B";
            else if (p >= 60) g[i] = "C";
            else if (p >= 50) g[i] = "D";
            else g[i] = "F";
        }
        return g;
    }

    static void display(int[][] m, double[][] s, String[] g) {
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\tPct\tGrade");
        for (int i = 0; i < m.length; i++)
            System.out.println((i + 1) + "\t" + m[i][0] + "\t" + m[i][1] + "\t" + m[i][2] + "\t" +
                (int)s[i][0] + "\t" + s[i][1] + "\t" + s[i][2] + "\t" + g[i]);
    }
}
