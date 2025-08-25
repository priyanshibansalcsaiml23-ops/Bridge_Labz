package java_array;

public class Q4 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25}; // Sample array

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println("Sum of all elements in the array: " + sum);
    }
}
