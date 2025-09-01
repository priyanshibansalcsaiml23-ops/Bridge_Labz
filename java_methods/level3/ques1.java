package level3;
import java.util.*;

public class ques1 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] h = new int[11];
        for (int i = 0; i < h.length; i++) h[i] = 150 + r.nextInt(101);
        int sum = 0, min = h[0], max = h[0];
        for (int x : h) {
            sum += x;
            if (x < min) min = x;
            if (x > max) max = x;
        }
        double mean = sum / (double) h.length;
        System.out.println("Shortest: " + min);
        System.out.println("Tallest: " + max);
        System.out.println("Mean: " + mean);
    }
}
