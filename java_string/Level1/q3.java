package java_string.Level1;
import java.util.Scanner;




    class q2 {
        static char[] getChars(String s) {
            char[] arr = new char[s.length()];
            for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i);
            return arr;
        }

        static boolean compareArrays(char[] a, char[] b) {
            if (a.length != b.length) return false;
            for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
            return true;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            char[] arr1 = getChars(str);
            char[] arr2 = str.toCharArray();
            boolean res = compareArrays(arr1, arr2);
            System.out.println("User-defined: " + String.valueOf(arr1));
            System.out.println("toCharArray: " + String.valueOf(arr2));
            System.out.println("Are equal: " + res);
        }
    }

