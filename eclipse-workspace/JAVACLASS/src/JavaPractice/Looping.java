package JavaPractice;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "madam"; 

        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
        
        //2
        int n = 10; 
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        
        System.out.println();
        
        //3
         n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        
        //4
       
                int number = 12345; 
                int count = 0;

                int temp = number;
                while (temp != 0) {
                    temp /= 10;
                    count++;
                }

                System.out.println("Number of digits in " + number + " is: " + count);
            
	}

}


