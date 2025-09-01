package java_string.Level2;

import java.util.*;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[][] res = new String[n][3];
        int pw = 0, cw = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Game " + (i + 1) + " - Enter rock/paper/scissors: ");
            String u = sc.nextLine().toLowerCase();
            String c = comp();
            String w = win(u, c);
            if (w.equals("Player")) pw++;
            else if (w.equals("Computer")) cw++;
            res[i][0] = u;
            res[i][1] = c;
            res[i][2] = w;
        }

        String[][] stats = stat(pw, cw, n);
        show(res, stats);
    }

    static String comp() {
        int r = (int)(Math.random() * 3);
        return r == 0 ? "rock" : r == 1 ? "paper" : "scissors";
    }

    static String win(String u, String c) {
        if (u.equals(c)) return "Draw";
        if ((u.equals("rock") && c.equals("scissors")) ||
            (u.equals("paper") && c.equals("rock")) ||
            (u.equals("scissors") && c.equals("paper"))) return "Player";
        return "Computer";
    }

    static String[][] stat(int pw, int cw, int n) {
        String[][] s = new String[2][3];
        s[0][0] = "Player";
        s[1][0] = "Computer";
        s[0][1] = String.valueOf(pw);
        s[1][1] = String.valueOf(cw);
        s[0][2] = String.valueOf((pw * 100) / n) + "%";
        s[1][2] = String.valueOf((cw * 100) / n) + "%";
        return s;
    }

    static void show(String[][] r, String[][] s) {
        System.out.println("\nGame\tPlayer\tComputer\tWinner");
        for (int i = 0; i < r.length; i++)
            System.out.println((i + 1) + "\t" + r[i][0] + "\t" + r[i][1] + "\t\t" + r[i][2]);

        System.out.println("\nStats:");
        System.out.println("Name\tWins\tWin %");
        for (int i = 0; i < s.length; i++)
            System.out.println(s[i][0] + "\t" + s[i][1] + "\t" + s[i][2]);
    }
}
