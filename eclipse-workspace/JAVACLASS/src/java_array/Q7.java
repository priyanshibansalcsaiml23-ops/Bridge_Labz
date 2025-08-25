package java_array;

import java.util.HashMap;
import java.util.Map;

public class Q7 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 4, 3, 5, 2};

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequency of each element:");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
