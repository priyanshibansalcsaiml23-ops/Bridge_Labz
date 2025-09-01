package java_string.Level1;

public class q4 {
    public static void main(String[] args) {
        
        
        handle();
        }

        static void gen() {
            String t = null;
            try {
                System.out.println(t.length());
            } catch (NullPointerException e) {
                System.out.println("NullPointerException caught");
            }
        }

        static void handle() {
            String t = null;
            try {
                System.out.println(t.length());
            } catch (NullPointerException e) {
                System.out.println("NullPointerException caught");
            }
}
