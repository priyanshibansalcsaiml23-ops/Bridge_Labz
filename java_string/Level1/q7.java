package java_string.Level1;

public class q7 {
    static void genEx() {
        String s = "abc";
        int n = Integer.parseInt(s);
    }

    static void handleEx() {
        String s = "xyz";
        try {
            int n = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }

    public static void main(String[] args) {
        // This will throw an exception and stop the program
        // genEx();

        // This will handle the exception
        handleEx();
    }
}
