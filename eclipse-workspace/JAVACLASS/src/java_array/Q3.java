package java_array;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int[] o = {10, 20, 30, 40, 50};
        int[] copy = new int[o.length];

        // Copying elements manually
        for (int i = 0; i < o.length; i++) {
            copy[i] = original[i];
        }

        System.out.println("Original Array: " + Arrays.toString(o));
        System.out.println("Copied Array:   " + Arrays.toString(copy));
    }
}

