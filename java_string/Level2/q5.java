package java_string.Level2;

import java.util.*;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] res = countVC(s);
        System.out.println("Vowels: " + res[0]);
        System.out.println("Consonants: " + res[1]);
    }

    static String check(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return "Vowel";
            else return "Consonant";
        }
        return "Other";
    }

    static int[] countVC(String s) {
        int v = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            String r = check(s.charAt(i));
            if (r.equals("Vowel")) v++;
            else if (r.equals("Consonant")) c++;
        }
        return new int[]{v, c};
    }
}
